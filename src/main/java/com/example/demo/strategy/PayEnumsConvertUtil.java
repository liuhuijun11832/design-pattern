package com.example.demo.strategy;

/**
 * @Description:
 * @Author: Joy Liu
 * @Date: 2019-04-02 13:53
 */
public class PayEnumsConvertUtil {

    private static StrategyEnums[] strategyEnums = StrategyEnums.values();

    public static StrategyEnums convert(String type){
        for (StrategyEnums strategyEnum : strategyEnums) {
            if(strategyEnum.getValue().equals(type)) return strategyEnum;
        }
        return null;
    }

}
