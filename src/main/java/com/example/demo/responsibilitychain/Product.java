package com.example.demo.responsibilitychain;

/**
 * @Description: 产品经理类
 * @Author: 刘会俊
 * @Date: 2019-03-22 13:44
 */
public class Product extends AbstractHandler {

    public Product() {
        super(AbstractHandler.FUNC_REQUIRE);
    }

    @Override
    protected void response(IRequirement requirement) {
        System.out.println("产品经理获得需求为："+requirement.getRequest()+"，正在处理中");
    }
}
