package com.hspedu.threaduse.syn;

/**
 * @author 赵好运
 * @version 1.0
 * 线程同步机制
 * 1.在多线程编程中，一些敏感数据不允许被多个线程同时访问，此时就使用同步访问技术，保证数据在任何时刻
 *   最多只有一个线程访问，以保证数据的安全性
 * 2.线程同步即：当有一个线程在对内存进行操作时，其他线程都不可以对这个内存地址进行操作，直到该线程完成操作，
 *   其他线程才能对该内存地址进行操作
 * 同步具体方法
 * 1.同步代码块
 *   synchronized(对象) {//得到对象的锁，才能操作同步代码
 *       //需要被同步的代码
 *   }
 * 2.synchronized还可以放在方法声明中，表示整个方法为同步方法
 * 3.实现接口创建线程的类中：非静态方法的锁默认是this，静态方法的锁默认是当前类本身
 *   因为若静态方法的加载在对象生成之前，所以当时还没有生成this对象，只能用其他确定的同一个对象或者
 *   当前类本身当作锁
 **/
public class SellTicket {
    public static void main(String[] args) {
        SellTicket01 sellTicket01 = new SellTicket01();
        SellTicket01 sellTicket011 = new SellTicket01();
        SellTicket01 sellTicket012 = new SellTicket01();

        sellTicket01.start();
        sellTicket011.start();
        sellTicket012.start();

//        SellTicket02 sellTicket02 = new SellTicket02();
//        new Thread(sellTicket02).start();//窗口1
//        new Thread(sellTicket02).start();//窗口2
//        new Thread(sellTicket02).start();//窗口3
    }
}
//使用Thread方式，使用synchronized实现同步
//继承Thread是创建一个对象来生成一个线程，因此每个线程的对象不同，因此不能使用this来作为锁。
//只能使用一个确定的同一个对象来当作所锁，锁是一个对象，且所有进程的该对象都相同
class SellTicket01 extends Thread {
    private static int ticketNum = 100;
    private static Object object = new Object();//设置的锁
    @Override
    public void run() {
        while (true) {
            synchronized (object) {
                if (ticketNum <= 0) {
                    System.out.println("票已售完");
                    break;
                }
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("窗口" + Thread.currentThread().getName() +
                        "售出一张票，剩余票数：" + (--ticketNum));
            }
        }
    }
}
//使用实现接口方法，使用synchronized实现同步
//实现接口是创建一个对象生成多个线程，因此多个线程是同一个对象，因此可以使用this来作为锁。
//因为所有进程的this都指向同一个对象
class SellTicket02 implements Runnable {
    private static int ticketNum = 100;
    private Boolean loop = true;
    private static Object object = new Object();
    @Override
    public void run() {
        while (loop) {
            sell();
        }
    }
    //非静态同步方法，锁默认是this对象
    public synchronized void sell() {//同步方法，在同一时刻只能有一个线程来操作
        if (ticketNum <= 0) {
            System.out.println("票已售完");
            loop = false;
            return;
        }
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("窗口" + Thread.currentThread().getName() +
                "售出一张票，剩余票数：" + (--ticketNum));
    }

    //静态方法实现同步
    public static void m() {
        synchronized (/*SellTicket02.class*/object) {//使用类本身或者其他确定的同一个对象
            System.out.println("111");
        }
    }
}