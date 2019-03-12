package com.code.pattern.strategy;

public class NewCustomerFewStrategy implements Strategy {
    @Override
    public double getPrice(double price) {
        System.out.println("原价");
        return price;
    }
}
