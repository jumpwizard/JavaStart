package com.hspedu.codeblock_;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        /**重难点
         * 创建一个对象时，类中的调用顺序
         * 1.调用静态代码块和静态属性初始化（若有多条，谁在前边先执行谁）
         * 2.调用普通代码块和普通属性的初始化(....)
         * 3.调用构造方法*/
        /**具体顺序如下
         * 1.类加载：静态代码块，静态属性初始化
         * 2.构造器：构造器的最前面隐含了（1.super()，2.调用普通代码块和普通属性初始化）
         * */
        Person person = new Person();
    }
}
class Person {
    private int n1 = getN1();
    private static int n2 = getN2();
    {
        System.out.println("普通代码块被调用");
    }
    static {
        System.out.println("静态代码块被调用");
    }
    public static int getN1() {
        System.out.println("普通属性n1");
        return 100;
    }
    public void setN1(int n1) {
        this.n1 = n1;
    }

    public static int getN2() {
        System.out.println("静态属性n2调用的静态方法n2");
        return 100;
    }

    public static void setN2(int n2) {
        Person.n2 = n2;
    }
    public static void say() {//即便是静态的，方法不被调用，就不会执行
        System.out.println("静态方法被调用");
    }
}