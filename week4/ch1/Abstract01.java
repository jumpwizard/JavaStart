package com.hspedu.abstract_;

public class Abstract01 {
}
abstract class Animal {
    private double size;
    //子类要对不同的方法进行重写，父类的方法没有太大意义时
    //可以使用抽象方法（没有方法体，只有方法名）
    //使用抽象方法必须在抽象类中
    //抽象类一般都会被继承，由子类重写实现抽象方法
    abstract public void eat();
    abstract public void cry();
}