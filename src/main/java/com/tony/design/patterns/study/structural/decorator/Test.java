package com.tony.design.patterns.study.structural.decorator;

public class Test {

    public static void main(String[] args) {
        EggFriedRice eggFriedRice = new EggFriedRice(new FriedRice());
        System.out.println(eggFriedRice.getDesc() +" 价格 "+ eggFriedRice.getPrice() + "元");
    }
}
