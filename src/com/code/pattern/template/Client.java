package com.code.pattern.template;

public class Client {
    public static void main(String[] args) {
        BankTemplateMethod templateMethod=new DrawMoney();
        templateMethod.process();
    }
}
