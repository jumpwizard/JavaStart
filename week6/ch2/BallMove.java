package com.hspedu.event_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author 赵好运
 * @version 1.0
 * 演示键盘控制小球上下移动 -> 讲解java的时间控制
 **/
public class BallMove extends JFrame {//窗口
    MyPanel myPanel = null;
    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
    }
    public BallMove() {
        myPanel = new MyPanel();
        this.add(myPanel);
        this.setSize(500,500);
        //窗口JFrame对象可以监听键盘事件
        this.addKeyListener(myPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
//面板
class MyPanel extends JPanel implements KeyListener{
    private int x;
    private int y;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x,y,20,20);//默认黑色
    }
    //有字符输出时，该方法就会触发
    @Override
    public void keyTyped(KeyEvent e) {

    }
    //当某个键被按下时，该方法就会触发
    @Override
    public void keyPressed(KeyEvent e) {
        //根据用户按下的不同键，来处理小球的移动（上下左右）
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                y--;
                break;
            case KeyEvent.VK_DOWN:
                y++;
                break;
            case KeyEvent.VK_LEFT:
                x--;
                break;
            case KeyEvent.VK_RIGHT:
                x++;
                break;
            default:
                break;
        }
        this.repaint();
    }
    //当某个键被释放（松开）时，该方法就会触发
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
