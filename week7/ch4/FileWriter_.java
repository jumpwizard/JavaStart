package com.hspedu.writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 赵好运
 * @version 1.0
 **/
public class FileWriter_ {
    public static void main(String[] args) {
        String filePath = "d:\\Game\\test2.txt";
        FileWriter fileWriter = null;
        char[] chars = {'必', '须', '是'};
        try {
            fileWriter = new FileWriter(filePath, true);
            //写入单个字符
            //fileWriter.write("那");
            //写入字符数组
            //fileWriter.write(chars);
            //写入指定数组的指定部分
            //fileWriter.write("那必须是我了".toCharArray(), 4, 2);
            //写入整个字符串
            //fileWriter.write("那必须是我了");
            //写入字符数组的指定部分
            fileWriter.write(chars, 0 , 2);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
