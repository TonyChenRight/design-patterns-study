package com.tony.design.patterns.study.behaviour.chainofresponsibility;

public abstract class Handler {
    protected Handler next;

    public void next(Handler next) {
        this.next = next;
    }

    abstract void doHandler(User user);
}
