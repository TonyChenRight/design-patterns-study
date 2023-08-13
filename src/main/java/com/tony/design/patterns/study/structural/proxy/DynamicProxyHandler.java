package com.tony.design.patterns.study.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Objects;

public class DynamicProxyHandler implements InvocationHandler {
    Object object;
    public DynamicProxyHandler(Object object) {
        this.object = object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(Objects.equals(method.getName(), "buyHouse")) {
            System.out.println("买房前准备");
            Object result = method.invoke(this.object, args);
            System.out.println("买房后装修");
            return result;
        }
        return method.invoke(this.object, args);
    }
}
