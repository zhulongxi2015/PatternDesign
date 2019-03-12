package com.code.pattern.observer.javaseObserver;


import java.util.Observer;

public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject=new ConcreteSubject();

        Observer a=new ObserverA();
        Observer b=new ObserverA();
        Observer c=new ObserverA();

        subject.addObserver(a);
        subject.addObserver(b);
        subject.addObserver(c);

        subject.setState(200);
    }
}
