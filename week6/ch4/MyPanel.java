package com.hspedu.tankgame3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @author 赵好运
 * @version 1.0
 * 坦克大战的绘图区域
 **/
public class MyPanel extends JPanel implements KeyListener, Runnable{
    //定义我的坦克
    Hero hero = null;
    //定义敌方坦克，考虑到多线程问题，放入到Vector中
    Vector<EnemyTank> enemyTanks = new Vector<>();
    //初始化坦克
    public MyPanel() {
        //初始化我方坦克
        hero = new Hero(100,100);
        hero.setSpeed(5);
        //初始化敌方坦克
        for (int i = 0; i < EnemyTank.getSize(); i++) {
            enemyTanks.add(new EnemyTank(100 * (i+1),0));
        }
    }
    @Override
    //绘画
    public void paint(Graphics g) {
        super.paint(g);
        //填充背景
        g.fillRect(0,0,1000,750);//填充矩形，默认黑色
        //画出自己的坦克
        drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 0);
        //画出敌人的坦克
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            drawTank(enemyTank.getX(),enemyTank.getY(),g,enemyTank.getDirect(),1);
        }
        //画出子弹
        if (hero.getShot() != null && hero.getShot().getLive() == true) {
            g.fill3DRect(hero.getShot().getX(), hero.getShot().getY(), 3,
                    3, false);
        }
    }
    /**
     * @param x 坦克的左上角x坐标
     * @param y 坦克的左上角y坐标
     * @param g 画笔
     * @param direct 坦克方向
     * @param type 坦克类型
     * */
    //坦克的模型
    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        //设置颜色
        switch (type) {
            case 0://己方坦克
                g.setColor(Color.cyan);
                break;
            case 1://敌方坦克
                g.setColor(Color.yellow);
                break;
        }
        //根据坦克方向，绘制坦克图像
        switch (direct) {
            case 0://表示向上
                g.fill3DRect(x, y,10,60,false);//坦克左履带
                g.fill3DRect(x + 30, y,10,60,false);//坦克右履带
                g.fill3DRect(x + 10,y + 10,20,40,false);//驾驶室
                g.fillOval(x + 10,y + 20,20,20);//炮台
                g.drawLine(x + 20,y,x + 20,y + 30);//炮筒
                break;
            case 1://表示向下
                g.fill3DRect(x, y,10,60,false);//坦克左履带
                g.fill3DRect(x + 30, y,10,60,false);//坦克右履带
                g.fill3DRect(x + 10,y + 10,20,40,false);//驾驶室
                g.fillOval(x + 10,y + 20,20,20);//炮台
                g.drawLine(x + 20,y + 30,x + 20,y + 60);//炮筒
                break;
            case 2://表示向左
                g.fill3DRect(x, y,60,10,false);//坦克左履带
                g.fill3DRect(x, y + 30,60,10,false);//坦克右履带
                g.fill3DRect(x + 10,y + 10,40,20,false);//驾驶室
                g.fillOval(x + 20,y + 10,20,20);//炮台
                g.drawLine(x + 30,y + 20,x,y + 20);//炮筒
                break;
            case 3://表示向右
                g.fill3DRect(x, y,60,10,false);//坦克左履带
                g.fill3DRect(x, y + 30,60,10,false);//坦克右履带
                g.fill3DRect(x + 10,y + 10,40,20,false);//驾驶室
                g.fillOval(x + 20,y + 10,20,20);//炮台
                g.drawLine(x + 30,y + 20,x + 60,y + 20);//炮筒
                break;
            default:
                break;
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //WASD移动
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                hero.moveUp();
                break;
            case KeyEvent.VK_A:
                hero.moveLeft();
                break;
            case KeyEvent.VK_S:
                hero.moveDown();
                break;
            case KeyEvent.VK_D:
                hero.moveRight();
                break;
        }
        //J发射
        if(e.getKeyCode() == KeyEvent.VK_J) {
            hero.shotEnemyTank();
        }
        //面板重绘（刷新）
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    //刷新界面的进程
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.repaint();
        }
    }
}
