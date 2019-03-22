package com.example.demo.responsibilitychain;

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
        if(this.requireType.equals(requirement.getType())) this.response(requirement);
        else if (this.nextHandler != null) this.nextHandler.processRequire(requirement);
        else System.out.println("无法处理该请求:"+requirement.getRequest());
    }
    //返回响应
    protected abstract void response(IRequirement requirement);



}
