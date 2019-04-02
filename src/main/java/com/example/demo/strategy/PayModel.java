package com.example.demo.strategy;

/**
 * @Description: 请求参数类
 * @Author: Joy Liu
 * @Date: 2019-04-02 11:04
 */
public class PayModel {

    private String payType;

    private int money;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public PayModel(String payType, int money) {
        this.payType = payType;
        this.money = money;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }
}
