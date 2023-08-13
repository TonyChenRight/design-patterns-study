package com.tony.design.patterns.study.creational.factorymethod;

import com.tony.design.patterns.study.creational.simplefactory.Pizza;

public class NYPepperPizza implements Pizza {
    @Override
    public String name() {
        return "NYPepperPizza";
    }
}
