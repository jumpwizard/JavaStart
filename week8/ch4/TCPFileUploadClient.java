package com.hspedu.upload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author 赵好运
 * @version 1.0
 * 客户端向服务端发送图片，收到服务端的确认后退出
 * 客户端实际上会自动分配端口与服务端的8888端口连接，该端口是随机的，由TCP/IP分配
 **/
public class TCPFileUploadClient {
    public static void main(String[] args) throws Exception {
        //1.指定ip和端口创建socket连接服务端
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        System.out.println("客户端 socket = " + socket.getClass());
        //2.创建流发送图片并接受确认
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
        FileInputStream fileInputStream = new FileInputStream("d:\\Game\\0.png");
        byte[] bytes = StreamUtils.streamToByteArray(fileInputStream);//将整个二进制文件转化为字节数组
        outputStream.write(bytes);
        socket.shutdownOutput();
        System.out.println(StreamUtils.streamToString(inputStream));
        //3.关闭流和socket
        inputStream.close();
        outputStream.close();
        fileInputStream.close();
        socket.close();
    }
}
