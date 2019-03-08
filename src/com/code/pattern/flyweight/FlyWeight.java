package com.code.pattern.flyweight;

/**
 * 抽象享元类
 */
public interface FlyWeight{
    void setColor(String c);
    String getColor();
    void display(Coordination cor);
}
/**
 *具体享元类（内部状态类）
 */
class ConcreteFlyWeight implements FlyWeight {
    private String color;

    public ConcreteFlyWeight (String color) {
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String  c) {
        this.color = c;
    }


    public void display(Coordination cor){
        System.out.println("棋子颜色："+this.color);
        System.out.println("棋子位置："+cor.getX()+","+cor.getY());
    }
}
