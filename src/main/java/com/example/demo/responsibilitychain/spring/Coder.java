package com.example.demo.responsibilitychain.spring;

import com.example.demo.responsibilitychain.IRequirement;
import org.springframework.stereotype.Component;

/**
 * @Description: 程序员
 * @Author: 刘会俊
 * @Date: 2019-03-22 13:36
 */
@Component
public class Coder extends AbstractHandler {


    public Coder() {
        super(AbstractHandler.CODE_REQUIRE);
    }

    @Override
    protected void response(IRequirement requirement) {
        System.out.println("程序员拿到需求为："+requirement.getRequest()+",正在处理！");
    }
}
