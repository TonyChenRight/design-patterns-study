package com.tony.design.patterns.study.structural.adapter;

public class Test {
    public static void main(String[] args) {
        VGA vga =new AdapterUSB2VGAImpl();
        vga.projection();
    }
}
