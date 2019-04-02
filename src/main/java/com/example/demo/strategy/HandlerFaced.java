package com.example.demo.strategy;

/**
 * @Description: 处理类门面
 * @Author: Joy Liu
 * @Date: 2019-04-02 11:08
 */
public class HandlerFaced {

    public void pay(PayModel payModel){

        StrategyEnums strategyEnum = PayEnumsConvertUtil.convert(payModel.getPayType());

        IPayStrategy strategy = StrategyFactory.createStrtegy(strategyEnum);

        StrategyContext strategyContext = new StrategyContext(strategy);

        strategyContext.exec(payModel.getMoney());
    }


}
