package com.example.demo;

import com.example.demo.responsibilitychain.CoderRequirment;
import com.example.demo.responsibilitychain.FunctionRequirement;
import com.example.demo.responsibilitychain.IRequirement;
import com.example.demo.responsibilitychain.spring.AbstractHandler;
import com.example.demo.responsibilitychain.spring.HandlerMapping;
import com.example.demo.strategy.PayModel;
import com.example.demo.strategy.spring.StrategyContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private HandlerMapping handlerMapping;

    @Autowired
    private StrategyContext strategyContext;

    @Test
    public void contextLoads() {
        IRequirement coderRequirment = new CoderRequirment();
        AbstractHandler coderHandler = handlerMapping.mapping(coderRequirment);
        coderHandler.processRequire(coderRequirment);

        IRequirement funcRequirment = new FunctionRequirement();
        AbstractHandler funcHandler = handlerMapping.mapping(funcRequirment);
        funcHandler.processRequire(funcRequirment);

    }

    @Test
    public void strategyTest(){
        PayModel payModel = new PayModel("union",10);
        strategyContext.pay(payModel);

        PayModel payModel1 = new PayModel("weixin", 20);
        strategyContext.pay(payModel1);

    }

}
