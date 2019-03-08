package com.code.pattern.mediator;

/**
 * 市场部
 */
public class Market implements Department {
    private Mediator m;

    public Market(Mediator m) {
        this.m = m;
        m.register("market",this);//注册到中介
    }

    @Override
    public void selfAction() {
        System.out.println("跑去接项目");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作！需要财务部的资金支持");
        m.command("finacial");//让中介去协调财务部门进行资金支持
    }
}
