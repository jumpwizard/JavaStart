package com.hspedu.threaduse;

/**
 * @author 赵好运
 * @version 1.0
 * 极简模拟Thread类的代理模式
 **/
class ProxyTest {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        ThreadProxy threadProxy = new ThreadProxy(tiger);
        threadProxy.start();
    }
}
//模拟Thread类
class ThreadProxy implements Runnable{
    //属性，类型是Runnable接口,可以指向实现其接口的子类对象
    private Runnable target = null;
    @Override
    public void run() {
        if (target != null) {
            target.run();
        }
    }
    public ThreadProxy(Runnable target) {
        this.target = target;
    }
    public void start() {
        start0();//这个方法真正实现多线程
    }
    //这个方法真正实现多线程
    public void start0() {
        run();
    }
}
class Animal {}
//该类已经继承了其他类，不能继承Thread类，只能实现Runnable并使用Thread代理
class Tiger extends Animal implements Runnable {
    @Override
    public void run() {
        System.out.println("老虎叫~");
    }
}