package com.tony.design.patterns.study.behaviour.interpreter;

public class DivisionNonTerminal extends NonTerminal implements Expression {
    public DivisionNonTerminal(Expression left, Expression right) {
        super(left, right);
    }
    @Override
    public int interpret() {
        return left.interpret() / right.interpret();
    }
}