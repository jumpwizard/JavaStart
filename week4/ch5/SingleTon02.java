package com.hspedu.single_;

public class SingleTon02 {
    public static void main(String[] args) {

    }
}
class Cat {
    private String name;
    private static Cat cat;
    //单例模式-懒汉式（存在线程安全问题）
    //1.构造器私有化
    //2.定义一个静态属性对象
    //3.提供一个公共的静态方法，可以创建并返回对象
    private Cat(String name) {
        this.name = name;
    }
    public static Cat getInstance() {
        //只会创建一次，也就是只创建一个对象
        if (cat == null) {
            cat = new Cat("wyt");
        }
        return cat;
    }
}