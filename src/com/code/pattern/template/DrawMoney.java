package com.code.pattern.template;

/**
 * 取款业务
 */
public class DrawMoney extends BankTemplateMethod {
    @Override
    public void transact() {
        System.out.println("我要取款");
    }
}
