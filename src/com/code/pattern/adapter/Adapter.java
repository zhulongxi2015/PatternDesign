package com.code.pattern.adapter;

/**
 * 适配器
 */
public class Adapter extends Adaptee implements Target {
    private Adaptee adaptee;
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleRequest() {
        adaptee.request();
    }
}
