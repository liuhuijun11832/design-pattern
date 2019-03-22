package com.example.demo.responsibilitychain;

/**
 * @Description: 功能需求
 * @Author: 刘会俊
 * @Date: 2019-03-22 13:48
 */
public class FunctionRequirement implements IRequirement {
    @Override
    public String getType() {
        return AbstractHandler.FUNC_REQUIRE;
    }

    @Override
    public String getRequest() {
        return "增加一个功能！！！";
    }
}
