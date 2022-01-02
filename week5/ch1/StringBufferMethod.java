package com.hspedu.stringbuffer;

/**
 * @author 赵好运
 * @version 1.0
 **/
public class StringBufferMethod {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("hello");
        //增
        stringBuffer.append(",");
        stringBuffer.append("周星驰,");
        stringBuffer.append("张敏").append(10.2).append(true);//都会转成字符形式
        System.out.println(stringBuffer);
        //删
        //删除索引0~4的的字符
        stringBuffer.delete(0, 5);
        System.out.println(stringBuffer);
        //改
        stringBuffer.replace(1,4, "吴孟达");
        System.out.println(stringBuffer);
        //插
        stringBuffer.insert(1,"周星驰,");
        System.out.println(stringBuffer);
        //长度
        System.out.println(stringBuffer.length());
    }
}
