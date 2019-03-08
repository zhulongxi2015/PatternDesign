package com.code.pattern.mediator;

/**
 * 研发部
 */
public class Development implements Department {
    private Mediator m;

    public Development(Mediator m) {
        this.m = m;
        m.register("development",this);//注册到中介
    }

    @Override
    public void selfAction() {
        System.out.println("研发部，专心科研");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作！没钱了，需要财务部门的资金支持");
        m.command("finacial");//让中介去协调财务部门进行资金支持
    }
}
