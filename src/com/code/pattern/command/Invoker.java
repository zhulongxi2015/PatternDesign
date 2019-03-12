package com.code.pattern.command;

/**
 * 命令的调用者和发起者
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }
    public void call(){
        command.execute();
    }
}
