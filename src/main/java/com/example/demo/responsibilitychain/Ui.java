package com.example.demo.responsibilitychain;

/**
 * @Description: UI设计师
 * @Author: 刘会俊
 * @Date: 2019-03-22 13:42
 */
public class Ui extends AbstractHandler {

    public Ui() {
        super(AbstractHandler.UI_REQUIRE);
    }

    @Override
    protected void response(IRequirement requirement) {
        System.out.println("UI设计师拿到需求为："+requirement.getRequest()+",正在处理！");
    }
}
