package com.hspedu.udp;

import java.io.IOException;
import java.net.*;

/**
 * @author 赵好运
 * @version 1.0
 * 发送端向接收端发送信息，收到接收端的回复后退出
 **/
public class UDPSenderB {
    public static void main(String[] args) throws IOException {
        //创建DatagramSocket，在9998端口监听接收端的回复
        DatagramSocket datagramSocket = new DatagramSocket(9998);
        //1.将要发送的数据装包,并指定好接收端的ip和端口
        byte[] bytes = "打游戏不".getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length,
                InetAddress.getByName("192.168.0.101"), 9999);
        //2.不用建立连接，直接发送
        datagramSocket.send(datagramPacket);
        //3.收到回复
        byte[] bytes1 = new byte[1024];
        DatagramPacket datagramPacket1 = new DatagramPacket(bytes1, bytes1.length);
        datagramSocket.receive(datagramPacket1);
        int length = datagramPacket1.getLength();//数据的实际长度
        byte[] data = datagramPacket1.getData();
        System.out.println(new String(data,0,length));
        //4.关闭资源
        datagramSocket.close();
    }
}
