package com.tony.design.patterns.study.behaviour.templatemethod;

public class Test {
    public static void main(String[] args) {
        Dish eggsWithTomato = new EggsWithTomato();
        eggsWithTomato.doDish();

        System.out.println("-----------------------------");

        Dish bouilli = new Bouilli();
        bouilli.doDish();
    }
}
