package com.hspedu.stringbuffer;

/**
 * @author 赵好运
 * @version 1.0
 **/
public class StringBuffer01 {
    //String VS StringBuffer
    //String 保存的是字符串常量，里面的值不能更改，每次String类的更新实际上是创建新的对象，
    // 而非对原来对象的改变，效率较低
    //StringBuffer保存的是字符串变量，里面的值可以更改，不用每次都创建新的对象
    public static void main(String[] args) {
        //1.StringBuffer的直接父类是AbstractStringBuilder
        //2.StringBuffer实现了Serializable接口，即StringBuffer的对象可以串行化
        //3.父类中有属性char[] value，存放字符串内容，不是final类型，因此存放在堆中，不在常量池
        //4.StringBuffer是一个final类，不能被继承
        StringBuffer stringBuffer = new StringBuffer();
    }
}
