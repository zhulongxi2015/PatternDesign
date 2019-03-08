package com.code.pattern.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * 总经理
 */
public class President implements Mediator {
    private Map<String ,Department> map=new HashMap<>();
    @Override
    public void command(String dname) {
        map.get(dname).selfAction();//根据部门名称，协调各个对象
    }

    @Override
    public void register(String dname,Department d) {
        map.put(dname,d);
    }
}
