package com.code.pattern.decorator;

import javax.swing.text.DefaultEditorKit;

//装饰类
public class CarDecorator implements ICar {
    private ICar car;

    public CarDecorator(ICar car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}
//具体装饰类
class FlyCar extends CarDecorator{
    public FlyCar(ICar car) {
        super(car);
    }
    public void fly(){
        System.out.println("天上飞");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}

class WaterCar extends CarDecorator{
    public WaterCar(ICar car) {
        super(car);
    }
    public void swim(){
        System.out.println("水上游");
    }

    @Override
    public void move() {
        super.move();
        swim();
    }
}

class AICar extends CarDecorator{
    public AICar(ICar car) {
        super(car);
    }
    public void autoMove(){
        System.out.println("自动跑");
    }

    @Override
    public void move() {
        super.move();
        autoMove();
    }
}
