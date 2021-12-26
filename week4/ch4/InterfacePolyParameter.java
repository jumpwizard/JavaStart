package com.hspedu.interface_.InterfacePoly_;
//接口的多态参数
public class InterfacePolyParameter {
    public static void main(String[] args) {
//        IF if = new IF;接口不能创建实例
        //接口的多态体现
        //接口类型的变量，可以指向实现该接口的对象实例
        IF monster = new Monster();
        IF car = new Car();

        //继承的多态体现
        AAA a = new BBB();
    }
}
interface IF {}
class Monster implements IF{}
class Car implements IF {}
class AAA {}
class BBB extends AAA {}