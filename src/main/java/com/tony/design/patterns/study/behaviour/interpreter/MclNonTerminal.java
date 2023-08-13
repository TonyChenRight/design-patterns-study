package com.tony.design.patterns.study.behaviour.interpreter;

public class MclNonTerminal extends NonTerminal implements Expression {
    public MclNonTerminal(Expression left, Expression right) {
        super(left, right);
    }
    @Override
    public int interpret() {
        return left.interpret() * right.interpret();
    }
}