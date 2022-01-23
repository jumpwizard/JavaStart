package com.hspedu.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 赵好运
 * @version 1.0
 * 服务端(字符流)
 **/
public class SocketTCP03Server {
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
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String str = bufferedReader.readLine();
        System.out.println(str);
        //4.通过socket.getOutputStream()，向客户端发送回复请求
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello,client");
        bufferedWriter.newLine();//...
        bufferedWriter.flush();
        //5.关闭流和服务端及其socket
        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();//serverSocket可以通过accept()返回多个socket【多个客户端连接服务器的并发】
    }
}
