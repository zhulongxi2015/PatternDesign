package com.code.pattern.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * 中介接口
 */
public interface Mediator {
    void command(String dname);
    void register(String dname,Department d);
}
