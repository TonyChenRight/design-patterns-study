package com.tony.design.patterns.study.creational.simplefactory;

public class SimplePizzaFactory {

    public static Pizza createPizza(String orderType) {
        if (orderType.equals("cheese")) {
            return new CheesePizza();
        } else if (orderType.equals("greek")) {
            return new GreekPizza();
        } else if (orderType.equals("pepper")) {
            return new PepperPizza();
        }
        return null;
    }
}
