package com.code.pattern.decorator;

public class Client {
    public static void main(String[] args){
        Car car= new Car();
        car.move();
        System.out.println("###");
        FlyCar flyCar=new FlyCar(car);
        flyCar.move();
        System.out.println("###");
        WaterCar waterCar=new WaterCar(car);
        waterCar.move();
        System.out.println("###");
        WaterCar waterCar2=new WaterCar(flyCar);
        waterCar2.move();

    }
}
