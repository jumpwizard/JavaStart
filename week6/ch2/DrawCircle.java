package com.hspedu.draw;

import javax.swing.*;
import java.awt.*;

/**
 * @author 赵好运
 * @version 1.0
 * 在面板上画圆
 * Component类提供了两个和绘图相关最重要的方法
 * 1.paint(Graphics g)绘制组件的外观
 * 2.repaint()刷新组件的外观
 * 当组件第一次在屏幕显示的时候，程序会自动的调用paint()方法来绘制组件
 * 在以下情况paint()将会再次被调用
 * 1.窗口最小化，再最大化
 * 2.窗口的大小发生变化
 * 3.repaint()函数被调用
 **/
@SuppressWarnings("all")
public class DrawCircle extends JFrame{//2.JFrame对应窗口,可以理解成是一个画框
    //3.定义一个面板
    private MyPanel myPanel = null;
    public static void main(String[] args) {
        new DrawCircle();
    }
    public DrawCircle() {
        //4.初始化面板
        myPanel = new MyPanel();
        //5.把面板放入到窗口（画框）
        this.add(myPanel);
        //6.设置窗口大小
        this.setSize(400, 300);
        //当点击窗口的x号，程序完全退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);//可以显示
    }
}
//1.先定义面板MyPanel类,继承JPanel类，才能在面板上画图像
class MyPanel extends JPanel {
    //（1）.MyPanel对象是画板
    //（2）.Graphics g，把g理解成是一支画笔
    //（3）.Graphics提供了很多绘图的方法
    @Override
    public void paint(Graphics g) {//绘图方法
        super.paint(g);//调用父类的方法完成初始化
        //1.画出一个椭圆
//        g.drawOval(10, 10, 100, 100);
        //2.画直线,起始点和终点
//        g.drawLine(10, 10, 100, 100);
        //3.画矩形边框,左上角和右下角
//        g.drawRect(10, 10, 100, 100);
        //4.画填充矩形
        //设置画笔的颜色
//        g.setColor(Color.black);
//        g.fillRect(10,10,100,100);//填充其他图形依次类推
        //5.画图片
        //获取图片资源,/bg.png表示在该项目的根目录下去获取bg.png图片
//        Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bg.png"));
//        g.drawImage(image,10,10,175,221,this);
        //6.画字符串
        //给画笔设置颜色和字体
//        g.setColor(Color.black);
//        g.setFont(new Font("隶书", Font.BOLD,50));
//        g.drawString("赵好运",100,100);
    }
}