package com.code.pattern.strategy;

import javax.swing.text.AbstractDocument;

public class Client {
    public static void main(String[] args) {
        Strategy strategy=new OldCustomerFewStrategy();
        Context c=new Context(strategy);
        c.getPrice(33);
    }
}
