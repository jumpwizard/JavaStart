package com.hspedu.outputstream;

import java.io.*;

/**
 * @author 赵好运
 * @version 1.0
 **/
public class FileCopy_ {
    public static void main(String[] args) {
        //完成文件拷贝
        //1.创建文件输入流，将文件读入到程序
        //2.创建文件输出流，将读取到的文件数据，写入到指定的文件
        String inputFilePath = "d:\\Game\\0.png";
        String outputFilePath = "d:\\Game\\test\\1.png";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(inputFilePath);
            //文件流关闭重开的时候才会覆盖，所以这里不用追加构造器也行
            fileOutputStream = new FileOutputStream(outputFilePath);
            //定义字节数组提高效率
            byte[] bytes = new byte[1024];
            int readLen = 0;
            //边读边写
            while ((readLen = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes,0,readLen);
            }
            System.out.println("复制成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
