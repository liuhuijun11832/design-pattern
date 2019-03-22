package com.example.demo.responsibilitychain;

/**
 * @Description: 代码优化需求
 * @Author: 刘会俊
 * @Date: 2019-03-22 13:51
 */
public class CoderRequirment implements IRequirement {
    @Override
    public String getType() {
        return AbstractHandler.CODE_REQUIRE;
    }

    @Override
    public String getRequest() {
        return "优化一下代码！！！";
    }
}
