package com.tony.design.patterns.study.behaviour.interpreter;

public class Test {
    public static void main(String[] args) {
        System.out.println(new Cal("10 + 20 - 40 * 60").cal()); // -600
        System.out.println(new Cal("20 + 50 - 60 * 2").cal()); // 20
    }
}
