package com.code.pattern.strategy;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * 上下文 负责和具体策略交互，这样具体算法和直接的客户端分离了，使得算法可以独立于客户端独立的变化
 */
public class Context {
    private Strategy strategy;
    public Context(Strategy strategy) {
        this.strategy = strategy;//当前采用的算法
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public void getPrice(double price){
        System.out.println("您选择的报价："+strategy.getPrice(price));
    }

}
