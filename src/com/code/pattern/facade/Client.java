package com.code.pattern.facade;

public class Client {
    public static void main(String[] args){
        RegisterFacade facade =new RegisterFacade();
        facade.register();
    }
}
