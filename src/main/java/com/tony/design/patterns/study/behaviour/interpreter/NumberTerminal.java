package com.tony.design.patterns.study.behaviour.interpreter;

public class NumberTerminal implements Expression{
    private int number;

    public NumberTerminal(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return this.number;
    }
}
