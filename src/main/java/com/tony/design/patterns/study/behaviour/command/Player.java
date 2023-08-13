package com.tony.design.patterns.study.behaviour.command;

public class Player {
    public void play() {
        System.out.println("正常播放");
    }
    public void pause() {
        System.out.println("暂停播放");
    }
    public void stop() {
        System.out.println("停止播放");
    }
}
