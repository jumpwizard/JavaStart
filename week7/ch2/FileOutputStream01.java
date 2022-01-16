package com.hspedu.outputstream;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author 赵好运
 * @version 1.0
 * 将数据写入文件中，若文件不存在则创建
 **/
public class FileOutputStream01 {
    public static void main(String[] args) {

    }
    @Test
    public void writeFile() {
        String filePath = "d:\\Game\\test.txt";
        FileOutputStream fileOutputStream = null;
        try {
            //默认构造器的写入方式是覆盖而不是追加
            //fileOutputStream = new FileOutputStream(filePath);
            //追加可以使用追加的构造器
            fileOutputStream = new FileOutputStream(filePath, true);
            //写入一个字节
            //fileOutputStream.write('H');
            //写入字符串
            String str = "hello,world";
            //fileOutputStream.write(str.getBytes());
            fileOutputStream.write(str.getBytes(), 0, str.length());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
