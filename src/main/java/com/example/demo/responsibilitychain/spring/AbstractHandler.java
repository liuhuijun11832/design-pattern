package com.example.demo.responsibilitychain.spring;

import com.example.demo.responsibilitychain.IRequirement;

/**
 * @Description: 处理人抽象类
 * @Author: 刘会俊
 * @Date: 2019-03-22 13:14
 */
public abstract class AbstractHandler {

    public static String CODE_REQUIRE = "code";
    public static String UI_REQUIRE = "ui";
    public static String FUNC_REQUIRE = "func";

    private AbstractHandler nextHandler;

    private String requireType;

    public String getRequireType() {
        return requireType;
    }

    public AbstractHandler(String type) {
        this.requireType = type;
    }

    public void setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void setRequireType(String requireType) {
        this.requireType = requireType;
    }

    //处理请求
    public final void processRequire(IRequirement requirement){
       this.response(requirement);
    }
    //返回响应
    protected abstract void response(IRequirement requirement);



}
