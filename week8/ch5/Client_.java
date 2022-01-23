package com.hspedu.homework;

import com.hspedu.upload.StreamUtils;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author 赵好运
 * @version 1.0
 * 向服务端请求指定的文件并下载
 **/
public class Client_ {
    public static void main(String[] args) throws Exception {
        //1.建立连接
        Socket socket = new Socket(InetAddress.getByName("192.168.1.103"), 9999);
        //2.向服务端请求指定的文件
        OutputStream outputStream = socket.getOutputStream();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new
                FileOutputStream("src\\res.mp3"));
        outputStream.write("New Romantics".getBytes());
        socket.shutdownOutput();
        //3.将相应文件写入src目录
        byte[] bytes = StreamUtils.streamToByteArray(bufferedInputStream);
        bufferedOutputStream.write(bytes);
        //4.释放资源
        outputStream.close();
        bufferedInputStream.close();
        bufferedOutputStream.close();
        socket.close();
    }
}
