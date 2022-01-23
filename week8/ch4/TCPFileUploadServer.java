package com.hspedu.upload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 赵好运
 * @version 1.0
 * 服务端接受客户端的图片，将其保存到src目录，发送收到的确认，然后退出
 **/
public class TCPFileUploadServer {
    public static void main(String[] args) throws Exception {
        //1.监听端口
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务器在8888端口监听，等待连接...");
        //2.接收客户端的socket
        Socket socket = serverSocket.accept();
        System.out.println("服务端 socket = " + socket.getClass());
        //3.创建socket对应的流接受并把图片写入src目录
        BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        FileOutputStream fileOutputStream = new FileOutputStream("src\\1.png");
        byte[] bytes = StreamUtils.streamToByteArray(bufferedInputStream);
        fileOutputStream.write(bytes);
        //4.向客户端发送确认
        bufferedOutputStream.write("服务端收到图片".getBytes());
        //5.关闭流和socketserver及其socket
        bufferedInputStream.close();
        bufferedOutputStream.close();
        fileOutputStream.close();
        socket.close();
        serverSocket.close();
    }
}
