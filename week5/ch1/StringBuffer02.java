package com.hspedu.stringbuffer;

/**
 * @author 赵好运
 * @version 1.0
 **/
public class StringBuffer02 {
    public static void main(String[] args) {
        //1.默认创建一个大小为16的char[],用于存放字符内容
        StringBuffer stringBuffer = new StringBuffer();
        //2.通过构造器指定char[]的大小
        StringBuffer stringBuffer1 = new StringBuffer(100);
        //3.给一个String创建StringBuffer，char[]的大小是str.length + 16 (21)
        StringBuffer hello = new StringBuffer("hello");
    }
}
