package com.tony.design.patterns.study.behaviour.observer;

public class Test {
    public static void main(String[] args) {
        WatchServer server =new WatchServer();

        Observer userZhang = new User("ZhangSan");
        Observer userLi = new User("LiSi");
        Observer userWang = new User("WangWu");

        server.registerObserver(userZhang);
        server.registerObserver(userLi);
        server.registerObserver(userWang);
        server.setInformation("PHP是世界上最好用的语言！");

        System.out.println("----------------------------------------------");
        server.removeObserver(userZhang);
        server.setInformation("JAVA是世界上最好用的语言！");
    }
}
