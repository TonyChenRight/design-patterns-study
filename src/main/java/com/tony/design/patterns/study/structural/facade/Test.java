package com.tony.design.patterns.study.structural.facade;

public class Test {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
        System.out.println("=================");
        computer.shutDown();
    }
}
