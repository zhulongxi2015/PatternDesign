package com.code.pattern.observer;

public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject=new ConcreteSubject();

        Observer a=new ObserverA();
        Observer b=new ObserverA();
        Observer c=new ObserverA();

        subject.register(a);
        subject.register(b);
        subject.register(c);

        subject.setState(200);
    }
}
