package com.hspedu.interface_.InterfacePoly_;

public class InterfacePolyPass {
    public static void main(String[] args) {
        IG ig = new Person();
        //如果IG继承了IH接口，而person实现了IG接口，
        //则相当于person类也实现了IH类
        //这就是接口多态传递现象
        IH ih = new Person();
    }
}
interface IH {
    void say();
}
interface IG extends IH{}
class Person implements IG{
    @Override
    public void say() {
        System.out.println("111");
    }
}