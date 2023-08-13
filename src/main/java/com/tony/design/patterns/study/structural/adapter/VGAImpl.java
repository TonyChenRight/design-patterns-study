package com.tony.design.patterns.study.structural.adapter;

public class VGAImpl implements VGA{

    @Override
    public void projection() {
        System.out.println("使用VGA演示");
    }

    @Override
    public void b() {
        System.out.println("执行b方法");
    }

    @Override
    public void c() {
        System.out.println("执行c方法");
    }
}
