package com.code.pattern.chain;

/**
 * 总经理
 */
public class GenerorManager extends  Leader{
    public GenerorManager(String name){
        super(name);
    }
    @Override
    public void handlerRequest(LeaveRequest leaveRequest) {
        if(leaveRequest.getLeaveDays()>=10 && leaveRequest.getLeaveDays()<30){
            System.out.println("员工 "+leaveRequest.getEmpName()+" 请假 "+leaveRequest.getLeaveDays()+" 天");
            System.out.println("总经理 "+this.name+" 审批通过");
        }else{
            System.out.println("拒绝");
        }
    }
}
