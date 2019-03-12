package com.code.pattern.strategy;

public class NewCustomerManyStrategy implements Strategy{
    @Override
    public double getPrice(double price) {
        System.out.println("9折");
        return price*0.9;
    }
}
