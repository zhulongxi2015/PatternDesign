package com.code.pattern.observer.javaseObserver;

import java.util.Observable;

public class ConcreteSubject extends Observable {
    private int state;
    public int getState() {
        return state;
    }


    public  void setState(int s){
        state=s;
        setChanged();
        notifyObservers(s);
    }
}
