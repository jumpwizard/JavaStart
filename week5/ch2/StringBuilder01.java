package com.hspedu.stringbuilder_;

/**
 * @author 赵好运
 * @version 1.0
 **/
public class StringBuilder01 {
    //StringBuilder拥有与StringBuffer兼容的API，是StringBuffer的建议替换，且速度比StringBuffer
    //更快，但只能在单线程下使用，在单线程程序中，一般推荐使用StringBuilder
    public static void main(String[] args) {
        //1.StringBuilder 继承了 AbstractStringBuilder类
        //2.实现了Serializable，StringBuilder的对象可以串行化（即可以网络传输，可以保存到文件）
        //3.StringBuilder是final类，不能被继承
        //4.StringBuilder对象字符序列仍然存放在其父类，AbstractStringBuilder的 char[] value;
        //  因此字符序列也是存放在堆中
        //5.StringBuilder的方法，没有做互斥的处理，即没有synchronized关键字，因此只能在单线程下使用
        StringBuilder stringBuilder = new StringBuilder();
    }
}
