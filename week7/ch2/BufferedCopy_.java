package com.hspedu.outputstream;

import java.io.*;

/**
 * @author 赵好运
 * @version 1.0
 * 演示Buffered复制二进制文件
 * 字节流一般用于操作二进制文件，也可以操作文本文件，但效率相对较低
 * 之前用字节流读取到乱码是因为没有正确解码，但字节是一模一样的
 **/
public class BufferedCopy_ {
    public static void main(String[] args) throws IOException {
        String srcFilePath = "d:\\Game\\psc.jpg";
        String destFilePath = "d:\\Game\\test\\psc2.jpg";
        byte[] bytes = new byte[1024];
        int readLen = 0;

        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(srcFilePath));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destFilePath));

        while ((readLen = bufferedInputStream.read(bytes)) != -1) {
            bufferedOutputStream.write(bytes, 0, readLen);
        }

        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}
