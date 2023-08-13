package com.tony.design.patterns.study.behaviour.command;

public class Controller {
    public void excuse(IAction action) {
        action.excuse();
    }
}