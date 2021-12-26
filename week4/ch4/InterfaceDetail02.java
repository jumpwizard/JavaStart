package com.hspedu.interface_;

public class InterfaceDetail02 {
    /**接口的使用细节2
     * 1.一个类可以同时实现多个接口
     * 2.接口中的属性，默认而且必须是public ，static ，final修饰的
     * 3.接口中属性的访问形式：接口名.属性名
     * 4.接口不能继承其他类，但是可以继承多个别的接口
     * 5.接口的修饰符只能是public和默认，和类一样*/
    public static void main(String[] args) {
        System.out.println(IB.n1);
    }
}
interface IB {
    int n1 = 10;//等价于 public static final int n1 =10;
}
interface IC {}
class Cat implements IB,IC {
}
interface ID extends IB,IC {}