package com.hspedu.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author 赵好运
 * @version 1.0
 * 接收端监听端口，收到信息后回复，然后退出
 **/
public class UDPReceiverA {
    public static void main(String[] args) throws IOException {
        //1.创建一个DatagramSocket对象，在9999端口监听
        DatagramSocket datagramSocket = new DatagramSocket(9999);
        //2.构建DatagramPacket对象，用于接收数据包，因为udp传输中，数据被封装成DatagramPacket数据包形式传输
        //  所以传输前后要封装和拆包，单个数据包最大64K
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
        //3.接受数据包
        datagramSocket.receive(datagramPacket);
        //4.拆包并显示数据
        int length = datagramPacket.getLength();//实际接收到的数据字节长度
        byte[] data = datagramPacket.getData();
        System.out.println(new String(data,0,length));
        //5.回复
        byte[] bytes1 = "上号！".getBytes();
        DatagramPacket datagramPacket1 = new DatagramPacket(bytes1, bytes1.length,
                InetAddress.getByName("192.168.0.101"), 9998);
        datagramSocket.send(datagramPacket1);
        //6.关闭资源
        datagramSocket.close();
    }
}
