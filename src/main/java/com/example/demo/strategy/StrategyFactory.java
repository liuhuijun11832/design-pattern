package com.example.demo.strategy;

/**
 * @Description: 策略工厂
 * @Author: Joy Liu
 * @Date: 2019-04-02 9:02
 */
public class StrategyFactory {

    public static IPayStrategy createStrtegy(StrategyEnums strategyEnums){
        IPayStrategy IPayStrategy = null;
        switch (strategyEnums){
            case ALI:
                IPayStrategy = new AliPay();
                break;
            case WEIXIN:
                IPayStrategy = new WeixinPay();
                break;
            case UNION:
                IPayStrategy = new UnionPay();
                break;
            default:
        }
        return IPayStrategy;
    }

}
