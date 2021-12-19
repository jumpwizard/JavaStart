package com.student.override_;

public class Dog {
    //1.重写的方法应该与父类方法的名称，参数一样
    public void cry() {
        System.out.println("Dog wang!");
    }
    //2.重写方法与父类方法的返回类型应当一样
    //或者是父类方法返回类型的子类
    public String m1() {
        return null;
    }
    //3.重写方法不能缩小父类方法的访问权限（但可以扩大）
    //public > protected > 默认 > private
}
