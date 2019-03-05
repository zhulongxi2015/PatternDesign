package com.code.pattern.adapter;

/**
 * 需要被适配的类（无法满足客户需求的类）
 */
public class Adaptee {
    public void request(){
        System.out.println("被适配的类，处理请求");
    }
}
