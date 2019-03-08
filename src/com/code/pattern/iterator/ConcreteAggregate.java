package com.code.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义的聚合类（容器）
 */
public class ConcreteAggregate {
    private List<Object> list= new ArrayList<>();
    public ConcreteAggregate(){

    }
    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }
    public  void addObject(Object obj){
        list.add(obj);
    }
    public void removeObject(Object obj){
        list.remove(obj);
    }
    public MyIterator CreateIterator(){
        return new ConcreteIterator();
    }
    //使用内部类定义迭代器，可以直接使用外部类的属性
    private class ConcreteIterator implements MyIterator{
        private int cursor;
        @Override
        public void first() {
            this.cursor=0;
        }

        @Override
        public void next() {
            if(this.hasNext()){
                this.cursor++;
            }
        }

        @Override
        public boolean hasNext() {
            return this.cursor<list.size();
        }

        @Override
        public boolean isFirst() {
            return cursor==0;
        }

        @Override
        public boolean isLast() {
            return cursor==list.size()-1;
        }

        @Override
        public Object getCurrentObj() {
            return list.get(cursor);
        }
    }
}
