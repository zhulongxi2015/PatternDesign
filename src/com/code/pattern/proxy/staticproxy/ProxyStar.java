package com.code.pattern.proxy.staticproxy;

public class ProxyStar implements Star {
    private Star star;
    public ProxyStar(Star star){
        this.star=star;
    }
    @Override
    public void confer() {
        System.out.println("proxystar.confer()");
    }

    @Override
    public void signContract() {
        System.out.println("proxystar.signContract()");
    }

    @Override
    public void bookTicket() {
        System.out.println("proxystar.bookTicket()");
    }

    @Override
    public void sing() {
        star.sing();
    }

    @Override
    public void collectMoney() {
        System.out.println("proxystar.collectMoney()");
    }
}
