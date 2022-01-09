package com.hspedu.tankgame2;

import javax.swing.*;

/**
 * @author 赵好运
 * @version 1.0
 **/
public class TankGame02 extends JFrame {
    //定义MyPanel
    MyPanel myPanel = null;
    public static void main(String[] args) {
        TankGame02 tankGame01 = new TankGame02();
    }

    public TankGame02() {
        myPanel = new MyPanel();
        this.add(myPanel);//把绘图装入面板
        this.setSize(1000,750);
        this.addKeyListener(myPanel);//让JFrame监听键盘时间
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
