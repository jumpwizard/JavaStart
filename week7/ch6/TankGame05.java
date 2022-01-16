package com.hspedu.tankgame5;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author 赵好运
 * @version 3.0
 **/
public class TankGame05 extends JFrame {
    //定义MyPanel
    MyPanel myPanel = null;
    public static void main(String[] args) {
        TankGame05 tankGame01 = new TankGame05();
    }

    public TankGame05() {
        //定义图画
        myPanel = new MyPanel();
        //把绘图装入面板
        this.add(myPanel);
        //设置面板大小（尽量与图画一致）
        this.setSize(1300,950);
        //启动程序的自刷新进程
        new Thread(myPanel).start();
        //让JFrame监听键盘时间
        this.addKeyListener(myPanel);
        //关闭后结束进程
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //可视化
        this.setVisible(true);
        //设置关闭窗口的监听器
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Recorder.keepRecordFile();
                System.exit(0);
            }
        });
    }
}
