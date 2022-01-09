package com.hspedu.tankgame4;

import javax.swing.*;

/**
 * @author 赵好运
 * @version 3.0
 **/
public class TankGame04 extends JFrame {
    //定义MyPanel
    MyPanel myPanel = null;
    public static void main(String[] args) {
        TankGame04 tankGame01 = new TankGame04();
    }

    public TankGame04() {
        //定义图画
        myPanel = new MyPanel();
        //把绘图装入面板
        this.add(myPanel);
        //设置面板大小（尽量与图画一致）
        this.setSize(1020,800);
        //启动程序的自刷新进程
        new Thread(myPanel).start();
        //让JFrame监听键盘时间
        this.addKeyListener(myPanel);
        //关闭后结束进程
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //可视化
        this.setVisible(true);
    }
}
