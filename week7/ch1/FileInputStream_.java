package com.hspedu.inputstream;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author 赵好运
 * @version 1.0
 * 字节流效率低且不能读取汉字，适合读取二进制文件
 * 字符流适合读取文本文件
 *
 * 字节流一般用于操作二进制文件，也可以操作文本文件，但效率相对较低
 * 用字节流读取到乱码是因为没有正确解码，但字节是一模一样的
 **/
public class FileInputStream_ {
    public static void main(String[] args) {
    }
    //按字节读取，效率较低，且在UTF-8中汉字用三个字节表示，所以读到汉字会乱码
    @Test
    public void readFile01() {
        String filePath = "d:\\Game\\test2.txt";
        FileInputStream fileInputStream = null;
        int readData = 0;
        try {
            //创建FileInputStream对象，用于读取文件
            fileInputStream = new FileInputStream(filePath);
            //从该输入流读取一个字节的数据，如果没有输入可用，此方法将阻止。
            //返回-1表示读取完毕
            while ((readData = fileInputStream.read()) != -1) {
                System.out.print((char) readData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //关闭文件流，释放资源
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    //使用read（byte[] b）读取文件，提高效率
    @Test
    public void readFile02() {
        String filePath = "d:\\Game\\test2.txt";
        FileInputStream fileInputStream = null;
        int readLen = 0;
        byte[] bytes = new byte[8];//一次读取8个字节
        try {
            //创建FileInputStream对象，用于读取文件
            fileInputStream = new FileInputStream(filePath);
            //如果读取正常，返回实际读取到的字节数
            //返回-1表示读取完毕
            while ((readLen = fileInputStream.read(bytes)) != -1) {
                System.out.print(new String(bytes, 0, readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //关闭文件流，释放资源
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
