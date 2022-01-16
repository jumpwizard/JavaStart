package com.hspedu.outputstream;

import java.io.IOException;
import java.io.PrintStream;

/**
 * @author 赵好运
 * @version 1.0
 * 演示PrintStream（字节打印流）
 **/
public class PrintStream_ {
    public static void main(String[] args) throws IOException {
        //将输出位置设置为标准输出流（显示器）
        PrintStream printStream = System.out;
        printStream.println("hello");
        //print底层使用的使用的是write,所以可以直接调用write进行打印/输出
        printStream.write("hello".getBytes());
        printStream.close();

        //可以修改打印流输出的位置/设备
        System.setOut(new PrintStream("d:\\Game\\test.txt"));
        System.out.println("赵好运");
    }
}
