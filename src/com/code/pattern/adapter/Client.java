package com.code.pattern.adapter;

public class Client {
    //客户已经有target接口，要让它有adaptee的reqeust功能，这样就要 通过适配器Adapter将target和Adaptee适配，才能使target有adaptee的request功能
    public void test1(Target target) {
        target.handleRequest();
    }

    public static void main(String[] args) {
        Client c = new Client();
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);//将adaptee适配成target
        c.test1(target);
    }
}
