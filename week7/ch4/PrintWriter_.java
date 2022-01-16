package com.hspedu.writer;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 赵好运
 * @version 1.0
 * 演示PrintWriter使用 （字符打印流）
 **/
public class PrintWriter_ {
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter(System.out);
        printWriter.println("赵好运");
        printWriter.close();

        PrintWriter printWriter1 = new PrintWriter("d:\\Game\\test3.txt");
        printWriter1.write("赵好运zhy");
        printWriter1.close();
    }
}
