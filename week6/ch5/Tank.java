package com.hspedu.tankgame4;

import java.util.Vector;

/**
 * @author 赵好运
 * @version 1.0
 **/
public class Tank implements Runnable{
    private int x;//坦克左上角横坐标
    private int y;//坦克左上角纵坐标
    private int direct;//坦克方向,默认向上
    private int speed = 1;//坦克速度，默认为1
    private Shot shot = null;//子弹
    private Vector<Shot> shots = new Vector<>();//当有多发子弹时的的子弹存储集合
    private Boolean isLive = true;

    //坦克移动 上
    public void moveUp() {
        //先改变坦克的方向
        setDirect(0);
        if (y > 0) {
            //再修改坦克的坐标，使其移动
            setY(getY() - speed);
        }
    }
    //下
    public void moveDown(){
        setDirect(1);
        if (y + 60 < 750) {
            setY(getY() + speed);
        }
    }
    //左
    public void moveLeft(){
        setDirect(2);
        if (x > 0) {
            setX(getX() - speed);
        }
    }
    //右
    public void moveRight() {
        setDirect(3);
        if (x + 60 < 1000) {
            setX(getX() + speed);
        }
    }

    public void shotEnemyTank() {
        //设置同时发射的最大上限
        if (shots.size() == 5) {
            return;
        }
        switch (direct) {
            case 0://上
                shot = new Shot(x + 20, y, direct);
                break;
            case 1://下
                shot = new Shot(x + 20, y + 60, direct);
                break;
            case 2://左
                shot = new Shot(x, y + 20, direct);
                break;
            case 3://右
                shot = new Shot(x + 60, y + 20, direct);
                break;
            default:
                break;
        }
        shots.add(shot);
        new Thread(shot).start();
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Shot getShot() {
        return shot;
    }

    public void setShot(Shot shot) {
        this.shot = shot;
    }

    public Boolean getLive() {
        return isLive;
    }

    public void setLive(Boolean live) {
        isLive = live;
    }

    @Override
    public void run() {
    }

    public Vector<Shot> getShots() {
        return shots;
    }

    public void setShots(Vector<Shot> shots) {
        this.shots = shots;
    }
}
