package com.hspedu.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author 赵好运
 * @version 1.0
 * 客户端(字符流)
 **/
public class SocketTCP03Client {
    @SuppressWarnings("all")
    public static void main(String[] args) throws IOException {
        //1.连接服务端（ip,端口）,连接成功后，返回socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端 Socket = " + socket.getClass());
        //2.连接上后，生成socket，通过Socket.getOutputStream()得到和socket对象关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();
        //3.通过输出流，写入数据到数据通道
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello,server");
        bufferedWriter.newLine();//插入换行符，表示写入内容结束（但对方必须以readline方式读取时该结束标记才能生效）
        bufferedWriter.flush();//如果使用字符流，需要手动刷新，否则数据不会写入数据通道

        //4.通过socket.getInputStream()，读取服务端发送的信息，并显示
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String str = bufferedReader.readLine();
        System.out.println(str);
        //5.关闭流对象和Socket
        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
    }
}
