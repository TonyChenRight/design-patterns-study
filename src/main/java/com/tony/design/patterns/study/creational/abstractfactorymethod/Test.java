package com.tony.design.patterns.study.creational.abstractfactorymethod;

public class Test {
    public static void main(String[] args) {
        AbstractCoffeeShopFactory factory = new AmericanFactory();
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();
        System.out.println("coffee is " + coffee.name());
        System.out.println("dessert is " + dessert.name());
    }
}
