package com.tony.design.patterns.study.behaviour.visitor;

import java.util.Random;

public class Pm extends Employee{
    public Pm(String name) {
        super(name);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public Integer getProject() {
        return new Random().nextInt(10);
    }
}
