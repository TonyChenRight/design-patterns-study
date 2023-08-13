package com.tony.design.patterns.study.behaviour.visitor;

import java.util.Random;

public class Engineer extends Employee{
    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public Integer getCodeLine() {
        return new Random().nextInt(10000);
    }
}
