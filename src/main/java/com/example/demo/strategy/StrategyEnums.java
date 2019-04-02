package com.example.demo.strategy;

public enum StrategyEnums {
    ALI("ali"),
    WEIXIN("wx"),
    UNION("union");
    ;

    StrategyEnums(String value) {
        this.value = value;
    }

    private final String value;

    public final String getValue() {
        return value;
    }

}
