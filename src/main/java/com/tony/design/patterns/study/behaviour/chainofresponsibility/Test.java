package com.tony.design.patterns.study.behaviour.chainofresponsibility;

public class Test {

    public static void main(String[] args) {

        User user = new User();
        //校验通过
        //用户名或者密码不正确!请检查!
        user.setUsername("pyy52hz");
        user.setPassword("1234567");
        LoginService loginService = new LoginService();
        loginService.login(user);
        System.out.println("========================");
        //校验通过
        //登陆成功!角色为管理员!
        //角色为管理员,可以进行下一步操作!
        user.setUsername("pyy52hz");
        user.setPassword("123456");
        loginService.login(user);
    }
}
