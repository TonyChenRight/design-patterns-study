package com.tony.design.patterns.study.behaviour.mediator;

public abstract class Person {
    protected String name;
    protected MediatorCompany mediatorCompany;

    public Person(String name, MediatorCompany mediatorCompany) {
        this.name = name;
        this.mediatorCompany = mediatorCompany;
    }
}
