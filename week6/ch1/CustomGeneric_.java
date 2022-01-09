package com.hspedu.generic.customgeneric;

/**
 * @author 赵好运
 * @version 1.0
 * 自定义泛型类
 * 1.普通成员可以使用泛型（属性，方法）
 * 2.使用泛型的数组，不能初始化
 * 3.静态方法或静态属性中不能使用类的泛型
 * 4.泛型类的类型，是在创建对象时确定的（因为创建对象时，需要指定确定类型）
 * 5.如果在创建对象时，没有指定类型，默认为Object
 **/
public class CustomGeneric_ {
    public static void main(String[] args) {

    }
}
//自定义泛型，标识符一般是单个大写字母，泛型标识符可以有多个
class Tiger<T, R, M> {
    String name;
    R r;
    M m;
    T t;
    T[] ts;//可以定义数组
//    T[] ts2 = new T[8];//不可以给数组初始化，因为不确定类型，就不能正确开辟空间
    public void m1(M m) {}//ok
    //因为静态成员的加载在对象创建之前
//    public static void m2(M m) {}//静态方法中不能使用类的泛型

    public Tiger(String name, R r, M m, T t, T[] ts) {
        this.name = name;
        this.r = r;
        this.m = m;
        this.t = t;
        this.ts = ts;
    }
}