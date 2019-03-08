package com.code.pattern.chain;

/**
 * 经理
 */
public class Manager extends Leader {
    public Manager(String name){
        super(name);
    }
    @Override
    public void handlerRequest(LeaveRequest leaveRequest) {
        if(leaveRequest.getLeaveDays()>=3 && leaveRequest.getLeaveDays()<10){
            System.out.println("员工 "+leaveRequest.getEmpName()+" 请假 "+leaveRequest.getLeaveDays()+" 天");
            System.out.println("经理 "+this.name+" 审批通过");
        }else{
            if(this.nextLeader!=null){
                this.nextLeader.handlerRequest(leaveRequest);
            }
        }
    }
}
