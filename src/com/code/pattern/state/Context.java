package com.code.pattern.state;

public class Context {
    private State state;
    public void setState(State s){
        System.out.println("修改状态");
        this.state=s;
        this.state.handle();
    }
}
