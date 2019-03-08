package com.code.pattern.flyweight;

public class Client {
    public static void  main(String[] args){
        FlyWeight f1=FlyWeightFactory.getFlyWeight("黑色");
        FlyWeight f2=FlyWeightFactory.getFlyWeight("黑色");
        System.out.println(f1);
        System.out.println(f2); //f1 f2都是同一个对象，具有相同的内部属性color，可以通过增加对外部类coordination的处理来实现对同一个对象的不同处理。

        System.out.println("##增加外部状态类的处理");
        f1.display(new Coordination(10,10));
        f2.display(new Coordination(20,20));

        //f1 f2始终都是同一个对象，只是通过外部状态类来实现不同的处理
        System.out.println(f1);
        System.out.println(f2);
    }
}
