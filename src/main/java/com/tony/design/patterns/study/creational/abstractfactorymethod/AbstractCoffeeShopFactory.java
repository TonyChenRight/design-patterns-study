package com.tony.design.patterns.study.creational.abstractfactorymethod;

import com.tony.design.patterns.study.creational.simplefactory.Pizza;


public abstract class AbstractCoffeeShopFactory {
    abstract Coffee createCoffee();
    abstract Dessert createDessert();
}
