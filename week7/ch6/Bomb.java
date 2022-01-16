package com.hspedu.tankgame5;

/**
 * @author 赵好运
 * @version 1.0
 **/
public class Bomb {
    private int x, y;
    private int live = 9;//爆炸的生命周期
    private Boolean isLive = true;

    public Bomb(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void lifeDown() {
        if (live > 0) {
            live--;
        } else {
            isLive = false;
        }
    }

    public int getLive() {
        return live;
    }

    public void setLive(Boolean live) {
        isLive = live;
    }

    public void setLive(int live) {
        this.live = live;
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
