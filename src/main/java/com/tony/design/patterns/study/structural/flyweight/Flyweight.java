package com.tony.design.patterns.study.structural.flyweight;

public class Flyweight implements IFlyweight {
    private String id;
    public Flyweight(String id){
        this.id = id;
    }
    @Override
    public void print() {
        System.out.println("Flyweight.id = " + getId() + " ...");
    }
    public String getId() {
        return id;
    }
}