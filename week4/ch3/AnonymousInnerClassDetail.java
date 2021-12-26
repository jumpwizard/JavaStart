package com.hspedu.innerclass;

public class AnonymousInnerClassDetail {
    /**匿名内部类细节
     * 1.既是一个类的定义，也是一个对象
     * 2.可以直接访问外部类的所有成员
     * 3.不能添加访问修饰符，其地位就是一个局部变量
     * 4.作用域：仅在定义它的代码块和方法中
     * 5.外部其他类不能访问匿名内部类（其本质是局部变量）
     * 6.如果外部类和局部内部类的成员重名，默认遵循就近原则如果想访问外部类的成员
     *   使用外部类名.this.成员 去访问*/
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();
    }
}
class Outer05 {
    public void f1() {
        //匿名内部类也有对象的特征，如下，这样使用不仅匿名内部类只能用一次
        //重写的hi方法也只能用一次
        new Person() {
            @Override
            public void hi(String str) {
                System.out.println(str);
            }
        }.hi("一次性使用");

        //匿名内部类只能用一次，重写的方法可以多次使用
        Person person = new Person() {
            @Override
            public void hi(String str) {
                System.out.println(str);
            }
        };
        person.hi("可以多次使用");
    }
}
class Person {
    public void hi(String str) {
    }
}