package com.hspedu.threaduse;

import java.util.concurrent.TransferQueue;

/**
 * @author 赵好运
 * @version 1.0
 * 实现Runnable接口来创建线程
 * 1.java是单继承，某些情况下，一个类可能以及继承了其他类，这时就不能继承Thread类了
 * 2.这时可以通过实现Runnable接口来创建线程(推荐使用)
 **/
public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
//        这里不能用start方法，因为Runnable接口中只有一个run方法，但run方法并不能创建线程
//        所以要创建Thread对象，并把dog对象（已经实现了Runnable接口）放入Thread
//        dog.start();
        //底层使用了设计模式：代理模式
        Thread thread = new Thread(dog);
        thread.start();
    }
}
class Dog implements Runnable { //通过实现Runnable接口来创建线程
    private int count = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("汪汪汪~" + (++count) + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 10) {
                break;
            }
        }
    }
}