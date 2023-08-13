package com.tony.design.patterns.study.creational.singleton;

public class Singleton1 {

    private Singleton1(){}

    private static final Singleton1 INSTANCE =new Singleton1();
    public static Singleton1 getInstance() {
        return INSTANCE;
    }

}
