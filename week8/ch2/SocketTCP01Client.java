package com.hspedu.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author 赵好运
 * @version 1.0
 * 客户端
 **/
public class SocketTCP01Client {
    public static void main(String[] args) throws IOException {
        //1.连接服务端（ip,端口）,连接成功后，返回socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端 Socket = " + socket.getClass());
        //2.连接上后，生成socket，通过Socket.getOutputStream()得到和socket对象关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();
        //3.通过输出流，写入数据到数据通道
        outputStream.write("hello,server".getBytes());//(字节流要将字符串转字节数组)
        //4.关闭流对象和Socket
        outputStream.close();
        socket.close();

    }
}
