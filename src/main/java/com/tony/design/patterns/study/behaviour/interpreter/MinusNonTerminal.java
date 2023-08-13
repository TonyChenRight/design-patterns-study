package com.tony.design.patterns.study.behaviour.interpreter;

public class MinusNonTerminal extends NonTerminal implements Expression{
    public MinusNonTerminal(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return left.interpret() - right.interpret();
    }
}
