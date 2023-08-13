package com.tony.design.patterns.study.behaviour.command;

public class PauseAction implements IAction{
    Player player;

    public PauseAction(Player player) {
        this.player = player;
    }
    @Override
    public void excuse() {
        this.player.pause();
    }
}
