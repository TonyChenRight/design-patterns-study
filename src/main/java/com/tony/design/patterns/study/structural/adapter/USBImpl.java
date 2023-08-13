package com.tony.design.patterns.study.structural.adapter;

public class USBImpl implements USB{
    @Override
    public void show() {
        System.out.println("使用USB演示");
    }
}
