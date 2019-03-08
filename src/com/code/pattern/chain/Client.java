package com.code.pattern.chain;

public class Client {
    public static  void main(String[] args){
        Leader a =new Director("zhangsan");
        Leader b=new Manager("lisi");
        Leader c=new GenerorManager("wangwu");

        //设置责任链关系
        a.setNextLeader(b);
        b.setNextLeader(c);

        LeaveRequest leaveRequest=new LeaveRequest("tom",10,"探亲");
        a.handlerRequest(leaveRequest);
    }
}
