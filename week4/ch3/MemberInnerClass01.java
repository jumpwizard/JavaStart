package com.hspedu.innerclass;

public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        outer08.f1();
        //6.外部其他类访问成员内部类的两种方法
        //1
        Outer08.InnerClass innerClass = outer08.new InnerClass();
        innerClass.say();
        //2
        Outer08.InnerClass innerClass1 = outer08.getInnerClass();
        innerClass1.say();
    }
}
class Outer08 {
    private int n1 = 10;
    public String name = "张三";
    //1.定义在外部类的成员位置上
    //3.可以添加任意访问修饰符，因为它的地位就是一个成员
    //4.作用域：整个类体
    //5.外部类访问成员内部类：创建对象，再访问
    //7.如果外部类和局部内部类的成员重名，默认遵循就近原则如果想访问外部类的成员
    //  使用外部类名.this.成员 去访问
    public class InnerClass {//成员内部类
        public void say() {
            //2.可以直接访问外部类的所有成员
            System.out.println("n1 = " + n1 + "\nname = " + name);
        }
    }
    public void f1() {
        InnerClass innerClass = new InnerClass();
        innerClass.say();
    }
    public InnerClass getInnerClass() {
        return new InnerClass();
    }

}