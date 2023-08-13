package com.tony.design.patterns.study.behaviour.visitor;

import java.util.Random;

public abstract class Employee {
    private String name;
    private Integer kpi;
    public Employee(String name) {
        this.name = name;
        this.kpi = new Random().nextInt(10);
    }

    public abstract void accept(IVisitor visitor);

    public String getName() {
        return name;
    }

    public Integer getKpi() {
        return kpi;
    }
}
