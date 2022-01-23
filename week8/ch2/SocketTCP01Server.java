package com.hspedu.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 赵好运
 * @version 1.0
 * 服务端
 **/
public class SocketTCP01Server {
    @SuppressWarnings("all")
    public static void main(String[] args) throws IOException {
        //1.在本机的9999 端口监听，等待连接.(前提是9999端口没有被其他程序占用，否则会异常)
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端，在9999端口监听，等待连接..");
        //2.当没有客户端连接9999 端口时，程序会阻塞，等待连接
        //  若有客户端连接，则会返回Socket对象，程序继续
        Socket socket = serverSocket.accept();
        System.out.println("服务端 socket = " + socket.getClass());
        //3.通过Socket.getInputStream(),读取客户端写入到数据通道的数据，并显示
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes,0,readLen));
        }
        //4.关闭流和服务端及其socket
        socket.close();
        inputStream.close();
        serverSocket.close();//serverSocket可以通过accept()返回多个socket【多个客户端连接服务器的并发】
    }
}
