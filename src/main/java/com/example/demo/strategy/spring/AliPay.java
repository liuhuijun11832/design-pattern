package com.example.demo.strategy.spring;

import com.example.demo.strategy.IPayStrategy;
import org.springframework.stereotype.Component;

/**
 * @Description: 支付宝支付策略
 * @Author: Joy Liu
 * @Date: 2019-04-02 8:57
 */
@Component("ali")
public class AliPay implements IPayStrategy {
    @Override
    public void doPay(int money) {
        System.out.println("调用了支付宝支付接口，支付"+money+"元");
    }
}
