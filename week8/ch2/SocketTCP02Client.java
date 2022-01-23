package com.hspedu.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author 赵好运
 * @version 1.0
 * 客户端(字节流)
 **/
public class SocketTCP02Client {
    @SuppressWarnings("all")
    public static void main(String[] args) throws IOException {
        //1.连接服务端（ip,端口）,连接成功后，返回socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端 Socket = " + socket.getClass());
        //2.连接上后，生成socket，通过Socket.getOutputStream()得到和socket对象关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();
        //3.通过输出流，写入数据到数据通道
        outputStream.write("hello,server".getBytes());//(字节流要将字符串转字节数组)
        //  设置结束标记,否则服务端会一直在读取状态
        socket.shutdownOutput();
        //4.通过socket.getInputStream()，读取服务端发送的信息，并显示
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes,0,readLen));
        }
        //5.关闭流对象和Socket
        outputStream.close();
        inputStream.close();
        socket.close();
    }
}
