package com.code.pattern.iterator;

public interface MyIterator {
    void first();//将游标指向第一个元素
    void next();//将游标指向下一个元素
    boolean hasNext();
    boolean isFirst();
    boolean isLast();
    Object getCurrentObj();
}
