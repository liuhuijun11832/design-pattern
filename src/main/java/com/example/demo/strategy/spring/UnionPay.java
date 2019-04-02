package com.example.demo.strategy.spring;

import com.example.demo.strategy.IPayStrategy;
import org.springframework.stereotype.Component;

/**
 * @Description: 银联支付策略
 * @Author: Joy Liu
 * @Date: 2019-04-02 9:00
 */
@Component("union")
public class UnionPay implements IPayStrategy {
    @Override
    public void doPay(int money) {
        System.out.println("调用了银联支付接口，支付"+money+"元");
    }
}
