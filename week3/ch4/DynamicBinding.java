package com.student.poly_.dynamic;

public class DynamicBinding {
    public static void main(String[] args) {
        //java的动态绑定机制
        //1.当调用对象方法时，该方法会和该对象的内存地址/运行类型绑定
        //2.当调用对象属性时，没有动态绑定机制，哪里声明，哪里使用
        A a = new B();//向上转型
        System.out.println(a.sum());
        System.out.println(a.sum1());
    }
}
