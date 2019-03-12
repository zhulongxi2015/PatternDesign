package com.code.pattern.memento;

public class Client {
    public static void main(String[] args) {
        CareTaker taker=new CareTaker();
        Emp emp=new Emp("zhangsan",22,4000);
        System.out.println("第一次打印对象："+emp.getName()+" "+emp.getAge()+" "+emp.getSalary());
        taker.setEmpMemento(emp.memento());//备忘一次

        emp.setAge(44);
        emp.setName("lisi");
        emp.setSalary(5000);
        System.out.println("第二次打印对象："+emp.getName()+" "+emp.getAge()+" "+emp.getSalary());

        emp.recovery(taker.getEmpMemento());//恢复到备忘录对象保存的状态

        System.out.println("第三次打印对象："+emp.getName()+" "+emp.getAge()+" "+emp.getSalary());
    }
}
