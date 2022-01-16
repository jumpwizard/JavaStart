package com.hspedu.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 赵好运
 * @version 1.0
 * 演示BufferedWriter的使用
 **/
public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "d:\\Game\\test.txt";
        //创建BufferedWriter
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true));
        //插入换行符
        bufferedWriter.newLine();
        bufferedWriter.write("hello, zhy");
        //关闭流
        bufferedWriter.close();
    }
}
