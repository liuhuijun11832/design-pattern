package com.example.demo.strategy;

/**
 * @Description: 策略上下文
 * @Author: Joy Liu
 * @Date: 2019-04-02 10:50
 */
public class StrategyContext {

    private IPayStrategy iStrategy;

    public StrategyContext(IPayStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }

    public IPayStrategy getiStrategy() {
        return iStrategy;
    }

    public void setiStrategy(IPayStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }

    public void exec(int money){
        iStrategy.doPay(money);
    }
}
