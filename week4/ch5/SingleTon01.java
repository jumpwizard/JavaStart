package com.hspedu.single_;

public class SingleTon01 {
    public static void main(String[] args) {
        //单例设计模式
        //在整个的软件系统中，对某个类只能存在一个对象实例，并且该类只提供一个取得其对象实例的方法
        //（限制某个极耗费资源的核心类只创建一个对象，或者某些只能存在一个对象的类）
        GirlFriend wyt = GirlFriend.getInstance();
        System.out.println(wyt);
    }
}
class GirlFriend {
    private String name;
    private static GirlFriend girlFriend = new GirlFriend("wyt");
    //如何保证只能创建一个对象（存在浪费资源的问题）
    //单例模式-饿汉式
    //1.将构造器私有化
    //2.在类的内部直接创建一个对象
    //3.提供一个公共的静态方法去返回该对象
    private GirlFriend(String name) {
        this.name = name;
    }
    //该方法必须是静态的，否则必须创建对象才能调用，自相矛盾..
    public static GirlFriend getInstance() {
        return girlFriend;
    }
}
