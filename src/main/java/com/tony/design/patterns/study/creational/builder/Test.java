package com.tony.design.patterns.study.creational.builder;

public class Test {

    public static void main(String[] args) {
        Computer computer = Computer.builder()
                .motherBoard("Extreme主板")
                .cpu("Inter 12900K")
                .memory("芝奇幻峰戟 16G*2")
                .disk("三星980Pro 2T")
                .gpu("华硕3090Ti 水猛禽")
                .power("雷神二代1200W")
                .heatSink("龙神二代一体式水冷")
                .chassis("太阳神机箱")
                .build();
        System.out.println(computer);

    }
}
