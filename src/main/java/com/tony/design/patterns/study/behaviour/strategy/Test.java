package com.tony.design.patterns.study.behaviour.strategy;

public class Test {

    public static void main(String[] args) {
        Environment environment=new Environment(new AddStrategy());
        int result=environment.calculate(20, 5);
        System.out.println(result);

        Environment environment1=new Environment(new SubStrategy());
        int result1=environment1.calculate(20, 5);
        System.out.println(result1);
    }
}
