package com.tony.design.patterns.study.behaviour.chainofresponsibility;

public class LoginService {
    public void login(User user) {
        System.out.println("user login " + user);
        Handler validateHandler = new ValidateHandler();
        Handler loginHandler = new LoginHandler();
        Handler authHandler = new AuthHandler();
        validateHandler.next(loginHandler);
        loginHandler.next(authHandler);
        validateHandler.doHandler(user);
    }
}
