package com.tony.design.patterns.study.creational.simplefactory;

public class Test {
    public static void main(String[] args) {
        Pizza pizza = SimplePizzaFactory.createPizza("cheese");
        System.out.println("pizza is " + pizza.name());
    }
}
