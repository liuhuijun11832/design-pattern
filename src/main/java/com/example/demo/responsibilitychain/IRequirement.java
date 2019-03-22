package com.example.demo.responsibilitychain;

/**
 * @Description: 需求接口
 * @Author: 刘会俊
 * @Date: 2019-03-22 13:08
 */
public interface IRequirement {

    //表明过来的需求类型
    public String getType();

    //获取需求处理之后的响应
    public String getRequest();

}
