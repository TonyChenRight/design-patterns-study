package com.tony.design.patterns.study.creational.abstractfactorymethod;

public class ItalyFactory extends AbstractCoffeeShopFactory{
    @Override
    Coffee createCoffee() {
        return new Cappuccino();
    }

    @Override
    Dessert createDessert() {
        return new Tiramisu();
    }
}
