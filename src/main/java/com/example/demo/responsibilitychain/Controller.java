package com.example.demo.responsibilitychain;

/**
 * @Description: 控制层
 * @Author: 刘会俊
 * @Date: 2019-03-22 13:45
 */
public class Controller {

    public static void main(String[] args) {

        AbstractHandler product = MappingHandler.findHandler();

        IRequirement coderRequire = new CoderRequirment();
        IRequirement functionRequire = new FunctionRequirement();
        IRequirement unkonwnRequire = new IRequirement() {
            @Override
            public String getType() {
                return "unknown";
            }

            @Override
            public String getRequest() {
                return "未知请求";
            }
        };
        product.processRequire(coderRequire);
        product.processRequire(functionRequire);
        product.processRequire(unkonwnRequire);

    }

}

class MappingHandler{

    public static AbstractHandler findHandler(){
        AbstractHandler coder = new Coder();
        AbstractHandler ui = new Ui();
        AbstractHandler product = new Product();

        product.setNextHandler(coder);
        coder.setNextHandler(ui);
        return product;
    }

}
