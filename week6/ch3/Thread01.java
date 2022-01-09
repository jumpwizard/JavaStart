package com.hspedu.threaduse;

/**
 * @author 赵好运
 * @version 1.0
 * 创建线程的的两种方式：
 * 1.继承Thread类，重写run方法
 * 2.实现Runnable接口，重写run方法
 * 演示继承Thread类来创建线程
 * 使用JConsole监视线程执行情况，并画出程序示意图
 **/
public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        //创建对象
        Cat cat = new Cat();
        System.out.println("启动子线程");
        //启动线程->最终会执行cat的run方法
        cat.start();
        /*解读源码
        * 1.start()方法调用了start0方法
        * public synchronized void start() {
        *     start0();
        * }
        * 2.start0()是本地方法，由JVM调用，底层由c/c++实现
        * private native void start0()
        * 3.真正实现了多线程的是start0方法
        * */

//        这样做只是单纯地调用了cat的run方法，没有启动线程，还是只有一个主线程
//        主线程会阻塞在这，先执行该方法，再向下执行，串行化方式
//        cat.run();
        //当主线程启动一个子线程Thread-0，主线程不会阻塞（即不会停下），会继续执行
        System.out.println("主线程继续执行" + Thread.currentThread().getName());
        for (int i = 0; i < 50; i++) {
            System.out.println("主线程输出" + i);
            Thread.sleep(1000);
        }
    }
}
//1.当一个类实现了Thread类，该类就可以当作线程使用
//2.我们会重写run方法，写上自己的业务代码
//3.run方法等一系列方法是Runnable接口中的方法，Thread类实现了该接口，因此我们有两种方法来重写该方法
//  继承Thread类或实现Runnable接口
class Cat extends Thread{
    @Override
    public void run() {
        int times = 0;
        while (true) {
            //每隔一秒叫一声
            System.out.println("喵喵喵~" + (++times) + "线程名" +
                    Thread.currentThread().getName());
            //让该线程休息一秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (times == 80) {
                break;
            }
        }
    }
}