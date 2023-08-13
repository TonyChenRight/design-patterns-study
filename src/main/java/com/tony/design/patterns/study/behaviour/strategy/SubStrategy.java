package com.tony.design.patterns.study.behaviour.strategy;

public class SubStrategy implements Strategy{
    @Override
    public int calc(int num1, int num2) {
        return num1 - num2;
    }
}
