package com.hspedu.tankgame3;

import javax.swing.*;

/**
 * @author 赵好运
 * @version 3.0
 **/
public class TankGame03 extends JFrame {
    //定义MyPanel
    MyPanel myPanel = null;
    public static void main(String[] args) {
        TankGame03 tankGame01 = new TankGame03();
    }

    public TankGame03() {
        //定义图画
        myPanel = new MyPanel();
        //把绘图装入面板
        this.add(myPanel);
        //设置面板大小（尽量与图画一致）
        this.setSize(1000,750);
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
