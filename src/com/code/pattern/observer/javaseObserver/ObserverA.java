package com.code.pattern.observer.javaseObserver;

import java.util.Observable;
import java.util.Observer;

public class ObserverA implements Observer{
    private int myState;
    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }


    @Override
    public void update(Observable o, Object arg) {
        myState=((ConcreteSubject)o).getState();
        System.out.println("状态变化："+myState);
    }
}
