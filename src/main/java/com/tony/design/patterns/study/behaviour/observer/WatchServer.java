package com.tony.design.patterns.study.behaviour.observer;

import java.util.ArrayList;
import java.util.List;

public class WatchServer implements Subject{
    private List<Observer> observers;
    private String message;

    public WatchServer() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (!observers.isEmpty()) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void setInformation(String s){
        this.message = s;
        System.out.println("微信服务更新消息： " + s);
        notifyObservers();
    }
}
