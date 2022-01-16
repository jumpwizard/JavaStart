package com.hspedu.tankgame5;

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
    //定义一个Vector,用于存放炸弹
    Vector<Bomb> bombs = new Vector<>();
    //定义三张爆炸图片，用于显示爆炸效果
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;

    //初始化坦克
    public MyPanel() {
        //初始化我方坦克
        hero = new Hero(300,300);
        Tank.getAllTanks().add(hero);
        hero.setSpeed(5);
        //初始化敌方坦克
        for (int i = 0; i < EnemyTank.getSize(); i++) {
            //创造一个敌方坦克
            EnemyTank enemyTank = new EnemyTank(100 * (i + 1), 0);
            new Thread(enemyTank).start();
            enemyTank.shotEnemyTank();
            //放入Vector集合
            Tank.getAllTanks().add(enemyTank);
            enemyTanks.add(enemyTank);
        }
        //初始化爆炸图片
        image1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_1.gif"));
        image2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_2.gif"));
        image3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_3.gif"));
    }

    //我方击毁坦克数量的显示界面（得分界面）
    public void showInfo(Graphics g) {
        //画出玩家的总成绩
        g.setColor(Color.BLACK);
        Font font = new Font("宋体", Font.BOLD, 25);
        g.setFont(font);
        g.drawString("累计击毁的敌方坦克", 1020, 30);
        drawTank(1020, 60, g, 0, 1);
        g.setColor(Color.BLACK);
        g.drawString(Recorder.getDestroyNum() + "",1080,100);
    }

    @Override
    //绘画
    public void paint(Graphics g) {
        super.paint(g);
        //填充背景
        g.fillRect(0,0,1000,750);//填充矩形，默认黑色
        //画出计分板
        showInfo(g);
        //画出自己的坦克
        if (hero != null && hero.getLive()) {
            drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 0);
        }
        //画出自己的子弹
        for (int i = 0; i < hero.getShots().size(); i++) {
            Shot shot = hero.getShots().get(i);
            if (shot != null && shot.getLive()) {
                g.fill3DRect(shot.getX(), shot.getY(), 3, 3, false);
            } else {
                hero.getShots().remove(shot);
            }
        }
        //画出敌人的坦克和子弹
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            if (enemyTank.getLive()) {
                drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 1);
            }
            //画出所有敌军子弹
            for (int j = 0; j < enemyTank.getShots().size(); j++) {
                Shot shot = enemyTank.getShots().get(j);
                if (shot != null && shot.getLive()) {
                    g.fill3DRect(shot.getX(),shot.getY(), 3,3, false);
                } else {
                    enemyTank.getShots().remove(shot);
                }
            }
        }
        //显示爆炸
        for (int i = 0; i < bombs.size(); i++) {
            Bomb bomb = bombs.get(i);
            //根据bomb对象的life值去画出对应的图片
            if (bomb.getLive() > 6) {
                g.drawImage(image1,bomb.getX(),bomb.getY(),60,60,this);
            } else if (bomb.getLive() > 3) {
                g.drawImage(image2,bomb.getX(),bomb.getY(),60,60,this);
            } else {
                g.drawImage(image3,bomb.getX(),bomb.getY(),60,60,this);
            }
            //炸弹生命值减少
            bomb.lifeDown();
            if (bomb.getLive() == 0) {
                bombs.remove(bomb);
            }
        }
    }
    /**
     * @param x 坦克的左上角x坐标
     * @param y 坦克的左上角y坐标
     * @param g 画笔
     * @param direct 坦克方向
     * @param type 坦克类型
     * */
    //画出坦克的模型
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
    //判断子弹是否击中坦克,并将其移除
    public void hitTank(Shot s, Tank tank) {
        switch (tank.getDirect()) {
            case 0://上
            case 1://下
                if (s.getX() >= tank.getX() && s.getX() <= tank.getX() + 40
                        && s.getY() >= tank.getY() && s.getY() <= tank.getY() + 60) {
                    s.setLive(false);
                    tank.setLive(false);
                    //将被击中的坦克移除
                    if (tank instanceof EnemyTank) {
                        enemyTanks.remove(tank);
                        Recorder.addDestroyNum();
                    }
                    Tank.getAllTanks().remove(tank);
                    //创建爆炸对象，加入到bombs集合
                    Bomb bomb = new Bomb(tank.getX(), tank.getY());
                    bombs.add(bomb);
                }
                break;
            case 2://左
            case 3://右
                if (s.getX() >= tank.getX() && s.getX() <= tank.getX() + 60
                        && s.getY() >= tank.getY() && s.getY() <= tank.getY() + 40) {
                    s.setLive(false);
                    tank.setLive(false);
                    //创建爆炸对象，加入到bombs集合
                    //将被击中的坦克移除
                    if (tank instanceof EnemyTank) {
                        enemyTanks.remove(tank);
                        Recorder.addDestroyNum();
                    }
                    Tank.getAllTanks().remove(tank);
                    Bomb bomb = new Bomb(tank.getX(), tank.getY());
                    bombs.add(bomb);
                }
                break;
            default:
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {}

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
    public void keyReleased(KeyEvent e) {}

    @Override
    //刷新界面的进程，并判断是否有子弹击中坦克
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //判断我方子弹
            if (hero.getShots() != null && hero.getShots().size() > 0) {
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    for (int j = 0; j < hero.getShots().size(); j++) {
                        Shot shot = hero.getShots().get(j);
                        hitTank(shot, enemyTank);
                    }
                }
            }
            //判断敌方子弹
            for (int i = 0; i < enemyTanks.size(); i++) {
                EnemyTank enemyTank = enemyTanks.get(i);
                if (enemyTank.getShots() != null && enemyTank.getShots().size() > 0) {
                    for (int j = 0; j < enemyTank.getShots().size(); j++) {
                        Shot shot = enemyTank.getShots().get(j);
                        hitTank(shot, hero);
                    }
                }
            }
            this.repaint();
        }
    }
}
