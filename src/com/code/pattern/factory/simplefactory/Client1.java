package com.code.pattern.factory.simplefactory;

public class Client1 {
    public static  void main(String[] args){
        Car audi=CarFactory.createCar("audi");
        Car byd=CarFactory.createCar("byd");
        audi.run();
        byd.run();
    }
}
