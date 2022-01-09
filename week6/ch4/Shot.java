package com.hspedu.tankgame3;

import javax.swing.text.StyledEditorKit;
import java.awt.event.KeyEvent;

/**
 * @author 赵好运
 * @version 1.0
 * 射击子弹
 **/
public class Shot implements Runnable{
    private int x;
    private int y;
    private int direct;
    private int speed = 2;
    private Boolean isLive = true;

    public Shot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    @Override
    public void run() {
        while (true) {
            //休眠50毫秒
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            switch (direct) {
                case 0://上
                    y = y - speed;
                    break;
                case 1://下
                    y = y + speed;
                    break;
                case 2://左
                    x = x - speed;
                    break;
                case 3://右
                    x = x + speed;
                    break;
                default:
                    break;
            }
            if (x >= 1000 || y >= 750 || x <= 0 || y <= 0) {
                isLive = false;
                break;
            }

        }
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

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Boolean getLive() {
        return isLive;
    }

    public void setLive(Boolean live) {
        isLive = live;
    }
}
