package com.tony.design.patterns.study.behaviour.command;

public class StopAction implements IAction{
    Player player;

    public StopAction(Player player) {
        this.player = player;
    }

    @Override
    public void excuse() {
        this.player.stop();
    }
}
