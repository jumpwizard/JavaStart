package com.hspedu.properties_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 赵好运
 * @version 1.0
 * 使用传统方法读取mysql.properties文件
 **/
public class Properties01 {
    public static void main(String[] args) throws IOException {
        //读取mysql.properties文件，并得到ip，user，pwd
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\mysql.properties"));
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            String[] split = line.split("=");
            System.out.println(split[0] + "值是：" + split[1]);
        }
    }
}
