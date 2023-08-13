package com.tony.design.patterns.study.behaviour.chainofresponsibility;


import org.apache.commons.lang3.StringUtils;

public class ValidateHandler extends Handler{
    @Override
    public void doHandler(User user) {
        if (StringUtils.isBlank(user.getUsername()) || StringUtils.isBlank(user.getPassword())) {
            System.out.println("用户名或者密码为空!");
            return;
        }
        System.out.println("校验通过");
        if (next != null) {
            next.doHandler(user);
        }
    }
}
