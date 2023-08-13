package com.tony.design.patterns.study.structural.proxy;

public class BuyHouseImpl implements BuyHouse{
    @Override
    public void buyHouse() {
        System.out.println("我要买房");
    }

    @Override
    public void name() {
        System.out.println("希望之家");
    }
}
