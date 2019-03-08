package com.code.pattern.chain;

/**
 * 主任
 */
public class Director extends Leader {
    public Director(String name){
        super(name);
    }
    @Override
    public void handlerRequest(LeaveRequest leaveRequest) {
        if(leaveRequest.getLeaveDays()<3){
            System.out.println("员工 "+leaveRequest.getEmpName()+" 请假 "+leaveRequest.getLeaveDays()+" 天");
            System.out.println("主任 "+this.name+" 审批通过");
        }else{
            if(this.nextLeader!=null){
                this.nextLeader.handlerRequest(leaveRequest);
            }
        }
    }
}
