package com.code.pattern.iterator;

public class Client {
    public static void main(String[] args){
        ConcreteAggregate concreteAggregate=new ConcreteAggregate();
        concreteAggregate.addObject("aa");
        concreteAggregate.addObject("bb");
        concreteAggregate.addObject("cc");
        MyIterator iterator=concreteAggregate.CreateIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.getCurrentObj());
            iterator.next();
        }
    }
}
