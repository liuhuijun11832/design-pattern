package com.example.demo.strategy;

/**
 * @Description: 支付控制类
 * @Author: Joy Liu
 * @Date: 2019-04-02 9:01
 */
public class Controller {

    public static void main(String[] args) {
        HandlerFaced handlerFaced = new HandlerFaced();

        PayModel payModel = new PayModel("union", 5);

        handlerFaced.pay(payModel);
    }

}
