package com.hspedu.stringbuffer;

/**
 * @author 赵好运
 * @version 1.0
 **/
public class StringAndStringBuffer {
    public static void main(String[] args) {
        //String -> StringBuffer
        String str = "hello";
        //方式1：使用构造器(新生成StringBuffer对象，str没有变化)
        StringBuffer stringBuffer = new StringBuffer(str);
        //方式2：使用StringBuffer的append方法
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1 = stringBuffer1.append(str);

        //StringBuffer -> String
        StringBuffer stringBuffer2 = new StringBuffer("zhy");
        //方式1，使用StringBuffer的toString方法
        String str1 = stringBuffer2.toString();
        //方式2，使用构造器来搞定
        String str2 = new String(stringBuffer2);

    }
}
