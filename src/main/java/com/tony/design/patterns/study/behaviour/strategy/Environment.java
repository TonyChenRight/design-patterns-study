package com.tony.design.patterns.study.behaviour.strategy;

public class Environment {

    private Strategy strategy;

    public Environment(Strategy strategy) {
        this.strategy = strategy;
    }

    public int calculate(int num1, int num2) {
        return strategy.calc(num1, num2);
    }
}
