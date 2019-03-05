package com.code.pattern.proxy.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler {
    private Star star;
    public StarHandler(Star star){
        this.star=star;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxystar.confer()");
        System.out.println("proxystar.signContract()");
        System.out.println("proxystar.bookTicket()");
        if(method.getName().toLowerCase().equals("sing")){
            method.invoke(star,args);
        }
        System.out.println("proxystar.collectMoney()");
        return null;
    }
}
