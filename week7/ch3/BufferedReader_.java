package com.hspedu.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 赵好运
 * @version 1.0
 * 演示BufferedReader使用
 **/
public class BufferedReader_ {
    public static void main(String[] args) throws Exception {
        String filePath = "d:\\Game\\test.txt";
        //创建BufferedReader
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        //读取
        String line = " ";
        //按行读取
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        //关闭流，这里只需关闭BufferedReader，底层会自动关闭节点流
        bufferedReader.close();
    }
}
