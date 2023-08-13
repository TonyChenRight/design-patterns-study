package com.tony.design.patterns.study.structural.decorator;

public class EggFriedRice extends FriedRice{
    private FriedRice friedRice;
    public EggFriedRice(FriedRice friedRice) {
        this.friedRice = friedRice;
    }

    String getDesc() {
        return friedRice.desc() + "+鸡蛋";
    }
    Integer getPrice() {
        return friedRice.price() + 2;
    }
}
