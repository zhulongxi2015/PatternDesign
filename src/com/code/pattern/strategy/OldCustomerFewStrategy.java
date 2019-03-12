package com.code.pattern.strategy;

import javax.xml.bind.SchemaOutputResolver;

public class OldCustomerFewStrategy implements Strategy {
    @Override
    public double getPrice(double price) {
        System.out.println("0.85折");
        return price* 0.85;
    }
}
