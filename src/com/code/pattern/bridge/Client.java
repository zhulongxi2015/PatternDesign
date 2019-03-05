package com.code.pattern.bridge;

public class Client {
    public static void main(String[] args){
        Brand brand=new Lenovo();
        Computer computer =new LaptopComputer(brand);//组合不同维度的类
        computer.sale();
    }
}
