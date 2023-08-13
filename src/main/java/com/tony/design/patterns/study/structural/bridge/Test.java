package com.tony.design.patterns.study.structural.bridge;

public class Test {

    public static void main(String[] args) {
        OperatingSystem w =new Windows(new Mp4());
        w.play("abc.mp4");
    }
}
