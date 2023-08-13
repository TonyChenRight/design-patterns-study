package com.tony.design.patterns.study.behaviour.interpreter;

public class PlusNonTerminal extends NonTerminal implements Expression{
    public PlusNonTerminal(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return left.interpret() + right.interpret();
    }
}
