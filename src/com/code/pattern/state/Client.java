package com.code.pattern.state;

public class Client {
    public static void main(String[] args) {
        Context ctx=new Context();
        ctx.setState(new BookedState());
    }
}
