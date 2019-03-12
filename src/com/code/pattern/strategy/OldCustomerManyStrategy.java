package com.code.pattern.strategy;

public class OldCustomerManyStrategy implements Strategy {
    @Override
    public double getPrice(double price) {
        System.out.println("0.8折");
        return price* 0.8;
    }
}
