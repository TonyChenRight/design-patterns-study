package com.tony.design.patterns.study.structural.bridge;

public class Windows extends OperatingSystem{
    public Windows(Video video) {
        super.video = video;
    }

    @Override
    public void play(String fileName) {
        video.decode(fileName);
    }
}
