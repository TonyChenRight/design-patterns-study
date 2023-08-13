package com.tony.design.patterns.study.behaviour.command;

public class Test {
    public static void main(String[] args) {
        Controller controller=new Controller();
        Player player = new Player();
        controller.excuse(new PlayAction(player));
        controller.excuse(new PauseAction(player));
        controller.excuse(new StopAction(player));
    }
}
