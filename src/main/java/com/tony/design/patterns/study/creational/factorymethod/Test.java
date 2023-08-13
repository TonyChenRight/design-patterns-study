package com.tony.design.patterns.study.creational.factorymethod;

import com.tony.design.patterns.study.creational.simplefactory.Pizza;

public class Test {
    public static void main(String[] args) {
        PizzaFactory factory = new LDOrderPizzaFactory();
        Pizza pizza = factory.createPizza("cheese");
        System.out.println("pizza is " + pizza.name());
    }
}
