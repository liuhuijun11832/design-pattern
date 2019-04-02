package com.example.demo.strategy;

/**
 * @Description: 微信支付策略
 * @Author: Joy Liu
 * @Date: 2019-04-02 8:58
 */
public class WeixinPay implements IPayStrategy {
    @Override
    public void doPay(int money) {
        System.out.println("调用了微信支付接口，支付"+money+"元");
    }
}
