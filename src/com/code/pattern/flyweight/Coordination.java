package com.code.pattern.flyweight;

/**
 * 外部状态类
 */
public class Coordination {
    private int x;
    private int y;

    public Coordination(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
