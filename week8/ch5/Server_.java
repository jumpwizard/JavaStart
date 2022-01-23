package com.hspedu.homework;

import com.hspedu.upload.StreamUtils;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 赵好运
 * @version 1.0
 * 接受客户端的请求，返回对应的文件，若没有该文件，就返回默认的文件
 **/
public class Server_ {
    @SuppressWarnings("all")
    public static void main(String[] args) throws Exception {
        //1.在9999端口监听
        ServerSocket serverSocket = new ServerSocket(9999);
        //2.接受客户端的请求
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        BufferedInputStream bufferedInputStream = null;
        OutputStream outputStream = socket.getOutputStream();

        String downloadName = StreamUtils.streamToString(inputStream);
        System.out.println("客户端希望下载文件：" + downloadName);
        //3.判断是否存在该文件,并上传相应文件 (别用switch判断字符串好吧....)
        if (downloadName.equals("The Call\r\n")) {
            bufferedInputStream = new BufferedInputStream(new
                        FileInputStream("d:\\Game\\The Call.mp3"));
        } else if (downloadName.equals("New Romantics\r\n")){
            bufferedInputStream = new BufferedInputStream(new
                        FileInputStream("d:\\Game\\New Romantics.mp3"));
        } else {
            System.out.println("true");
            bufferedInputStream = new BufferedInputStream(new
                    FileInputStream("d:\\Game\\New Romantics.mp3"));
        }
        byte[] bytes = StreamUtils.streamToByteArray(bufferedInputStream);
        outputStream.write(bytes);
        socket.shutdownOutput();
        //4.关闭资源
        inputStream.close();
        bufferedInputStream.close();
        outputStream.close();
        socket.close();
        serverSocket.close();

    }
}
