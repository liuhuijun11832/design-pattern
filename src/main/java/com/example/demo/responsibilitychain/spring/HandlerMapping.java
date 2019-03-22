package com.example.demo.responsibilitychain.spring;

import com.example.demo.responsibilitychain.IRequirement;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: Handler映射处理器
 * @Author: 刘会俊
 * @Date: 2019-03-22 14:45
 */
@Component
public class HandlerMapping implements InitializingBean, ApplicationContextAware {

    private ApplicationContext applicationContext;

    List<AbstractHandler> abstractHandlerList = new ArrayList<>();

    @Override
    public void afterPropertiesSet() throws Exception {
        String[] abstractHandlers = BeanFactoryUtils.beanNamesForTypeIncludingAncestors(applicationContext, AbstractHandler.class);
        for (String abstractHandlerName : abstractHandlers) {
            abstractHandlerList.add((AbstractHandler) applicationContext.getBean(abstractHandlerName));
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public AbstractHandler mapping(IRequirement requirement){
        if ( abstractHandlerList.size() > 0) {
            for (AbstractHandler abstractHandler : abstractHandlerList) {
                if (abstractHandler.getRequireType().equals(requirement.getType())){
                    return abstractHandler;
                }
            }
        }
        return null;
    }
}
