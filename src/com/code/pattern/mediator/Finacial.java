package com.code.pattern.mediator;

/**
 * 财务部
 */
public class Finacial implements Department {
    private Mediator m;

    public Finacial(Mediator m) {
        this.m = m;
        m.register("finacial",this);//注册到中介
    }

    @Override
    public void selfAction() {
        System.out.println("数钱");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作！对外部进行资金支持");
    }
}
