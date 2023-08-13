package com.tony.design.patterns.study.behaviour.command;

public class PlayAction implements IAction{
    Player player;

    public PlayAction(Player player) {
        this.player = player;
    }

    @Override
    public void excuse() {
        this.player.play();
    }
}
