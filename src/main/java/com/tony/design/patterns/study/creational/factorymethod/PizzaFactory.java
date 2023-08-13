package com.tony.design.patterns.study.creational.factorymethod;


import com.tony.design.patterns.study.creational.simplefactory.Pizza;

public interface PizzaFactory {
    Pizza createPizza(String orderType);
}
