package com.tony.design.patterns.study.structural.proxy;

import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {
        BuyHouseImpl buyHouse = new BuyHouseImpl();
        BuyHouse proxyInstance = (BuyHouse)Proxy.newProxyInstance(BuyHouse.class.getClassLoader(), new Class[]{BuyHouse.class}, new DynamicProxyHandler(buyHouse));
        proxyInstance.buyHouse();
        System.out.println("----------------------");
        proxyInstance.name();
    }
}
