package com.code.pattern.template;

public abstract class BankTemplateMethod {
    public void takeNumber(){
        System.out.println("排队取号");
    }
    public abstract void transact();//办理具体业务，钩子方法 ,相当于占位
    public void evaluate(){//反馈，评分
        System.out.println("反馈评分");
    }
    public  final void process(){//模板方法
        this.takeNumber();
        this.transact();
        this.evaluate();
    }
}
