package com.code.pattern.observer;

public class ObserverA implements Observer {
    private int myState;
    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }

    @Override
    public void update(Subject subject) {
        myState=((ConcreteSubject)subject).getState();
        System.out.println("改变状态："+myState);
    }
}
