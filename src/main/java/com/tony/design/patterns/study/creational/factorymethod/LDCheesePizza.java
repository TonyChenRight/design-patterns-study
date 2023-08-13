package com.tony.design.patterns.study.creational.factorymethod;

import com.tony.design.patterns.study.creational.simplefactory.Pizza;

public class LDCheesePizza implements Pizza {
    @Override
    public String name() {
        return "LDCheesePizza";
    }
}
