package com.hspedu.innerclass;

public class StaticInnerClass01 {
    /**静态内部类特点
     * 1.可以直接访问外部类的所有类型的静态成员，但不能直接访问非静态成员
     * 2.可以添加任意的访问修饰符，因为它的地位就是成员
     * 3.作用域：整个类体
     * 4.外部类访问静态内部类：创建对象，再访问
     * 5.外部其他类访问静态内部类(前提是满足成员访问权限)
     * 6.如果外部类和局部内部类的成员重名，默认遵循就近原则如果想访问外部类的成员
     *   使用外部类名.成员 (因为是静态成员，所以不用加this)去访问*/
    public static void main(String[] args) {
        Outer10 outer10 = new Outer10();
        outer10.m1();
        //5.外部其他类访问静态内部类
        //1
        Outer10.Inner10 inner10 = new Outer10.Inner10();
        inner10.say();
        //2
        Outer10.Inner10 inner101 = outer10.getInner10();
        inner101.say();
        //3
        Outer10.Inner10 inner102 = Outer10.getInner10_();
        inner102.say();
    }
}
class Outer10 {
    private int n1 = 10;
    private static int n2 = 20;

    public static class Inner10 {//静态内部类，放在外部类的成员位置，用static修饰
        public void say() {
            System.out.println("n2 = " + n2);
        }
    }
    public void m1() {
        Inner10 inner10 = new Inner10();
        inner10.say();
    }
    public Inner10 getInner10() {
        return new Inner10();
    }
    public static Inner10 getInner10_() {
        return new Inner10();
    }
}