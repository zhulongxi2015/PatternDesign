package com.code.pattern.memento;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 负责人类，负责管理备忘录对象
 */
public class CareTaker {
    private EmpMemento empMemento;
    //private Queue<EmpMemento> queue=new LinkedBlockingQueue<>();
    public EmpMemento getEmpMemento() {
        return empMemento;
    }

    public void setEmpMemento(EmpMemento empMemento) {
        this.empMemento = empMemento;
    }

}
