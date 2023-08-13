package com.tony.design.patterns.study.structural.bridge;

public class Ios extends OperatingSystem{
    public Ios(Video video) {
        super.video = video;
    }

    @Override
    public void play(String fileName) {
        video.decode(fileName);
    }
}
