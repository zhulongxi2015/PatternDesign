package com.code.pattern.chain;

import org.omg.CORBA.PUBLIC_MEMBER;

public abstract class Leader {
    protected String name;
    protected Leader nextLeader;

    public Leader(String name) {
        this.name = name;
    }
    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    /**
     * 处理请求的核心业务的方法
     * @param leaveRequest
     */
    public abstract  void handlerRequest(LeaveRequest leaveRequest);
}
