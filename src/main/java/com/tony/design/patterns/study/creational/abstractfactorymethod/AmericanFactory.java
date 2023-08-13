package com.tony.design.patterns.study.creational.abstractfactorymethod;

public class AmericanFactory extends AbstractCoffeeShopFactory{
    @Override
    Coffee createCoffee() {
        return new Americano();
    }

    @Override
    Dessert createDessert() {
        return new Cheesecake();
    }
}
