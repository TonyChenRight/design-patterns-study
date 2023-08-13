package com.tony.design.patterns.study.creational.factorymethod;

import com.tony.design.patterns.study.creational.simplefactory.Pizza;

public class NYOrderPizzaFactory implements PizzaFactory{
    @Override
    public Pizza createPizza(String orderType) {
        if (orderType.equals("cheese")) {
            return new NYCheesePizza();
        } else if (orderType.equals("pepper")) {
            return new NYPepperPizza();
        }
        return null;
    }
}
