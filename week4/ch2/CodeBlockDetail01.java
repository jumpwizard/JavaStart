package com.hspedu.codeblock_;

public class CodeBlockDetail01 {
    public static void main(String[] args) {
        //非静态代码块：每创建一个对象就会执行
        //静态代码块：伴随着类的加载被执行，且只会被执行一次
        /**类什么时候被加载：
         * 1.创建该类的对象实例时
         * 2.创建子类对象实例或使用子类的静态成员时（加载子类前一定要先加载父类）
         * 3.使用类的静态成员时（静态属性，静态方法）*/
        //普通代码块在创建对象实例时会被隐式调用，创建一次，调用一次
        //如果只使用类的静态成员，普通代码块不会被调用

    }
}
