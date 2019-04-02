package com.example.demo.strategy.spring;

import com.example.demo.strategy.IPayStrategy;
import com.example.demo.strategy.PayModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description: 策略上下文
 * @Author: Joy Liu
 * @Date: 2019-04-02 10:50
 */
@Component
public class StrategyContext {

    private final Map<String, IPayStrategy> stringMap = new ConcurrentHashMap<>();

    //会自动注入@component里写的字符串key，类型为IpayStrategy的beanMap
    @Autowired
    public StrategyContext(Map<String,IPayStrategy> stringStringMap) {
        this.stringMap.clear();
        stringStringMap.forEach(stringMap::put);
    }

    public void pay(PayModel payModel){
        if(payModel.getPayType() != null && payModel.getPayType().length() > 0) stringMap.get(payModel.getPayType()).doPay(payModel.getMoney());
    }
}
