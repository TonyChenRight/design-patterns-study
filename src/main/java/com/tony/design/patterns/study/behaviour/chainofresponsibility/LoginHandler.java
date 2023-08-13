package com.tony.design.patterns.study.behaviour.chainofresponsibility;

public class LoginHandler extends Handler {
    @Override
    public void doHandler(User user) {
        if (!"pyy52hz".equals(user.getUsername()) || !"123456".equals(user.getPassword())) {
            System.out.println("用户名或者密码不正确!请检查!");
            return;
        }
        user.setRole("admin");
        System.out.println("登陆成功!角色为管理员!");
        if (next != null) {
            next.doHandler(user);
        }
    }
}