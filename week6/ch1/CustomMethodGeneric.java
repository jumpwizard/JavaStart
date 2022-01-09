package com.hspedu.generic.customgeneric;

/**
 * @author 赵好运
 * @version 1.0
 * 泛型方法的使用
 * 1.泛型方法，可以定义在普通类中，也可以定义到泛型类中
 * 2.当泛型方法被调用时，类型会确定
 **/
public class CustomMethodGeneric {
    public static void main(String[] args) {

    }
}
class Car {//普通类
    public void run() {}//普通方法
    public <T, R> void fly(T t, R r) {}//泛型方法
}
class Fish<T, R> {//泛型类
    public void run() {}//普通方法
    public void run2(T t) {}//使用了类声明的泛型的普通方法
    public <U, M> void eat(U u, M m) {}//泛型方法
}