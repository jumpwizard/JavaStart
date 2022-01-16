package com.hspedu.reader;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @author 赵好运
 * @version 1.0
 **/
public class FileReader_ {
    public static void main(String[] args) {

    }

    /**
     * 单个字符读取文件
     */
    @Test
    public void m1() {
        String filePath = "d:\\Game\\test2.txt";
        FileReader fileReader = null;
        int data = 0;
        try {
            fileReader = new FileReader(filePath);
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 字符数组读取文件
     */
    @Test
    public void m2() {
        String filePath = "d:\\Game\\test2.txt";
        FileReader fileReader = null;

        int readLen = 0;
        char[] chars = new char[8];
        try {
            fileReader = new FileReader(filePath);
            while ((readLen = fileReader.read(chars)) != -1) {
                System.out.print(new String(chars, 0, readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
