package com.hspedu.api;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author 赵好运
 * @version 1.0
 * 演示InetAddress类的使用
 **/
public class API_ {
    public static void main(String[] args) throws UnknownHostException {
        //1.获取本机的InetAddress对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);//LAPTOP-H6QEUGT3/192.168.31.166

        //2.根据指定主机名，获取InetAddress对象
        InetAddress host1 = InetAddress.getByName("LAPTOP-H6QEUGT3");
        System.out.println(host1);//LAPTOP-H6QEUGT3/192.168.31.166

        //3.根据域名获取InetAddress对象，例如百度
        InetAddress host2 = InetAddress.getByName("www.baidu.com");
        System.out.println(host2);//www.baidu.com/110.242.68.4

        //4.通过InetAddress对象，获取对应的地址
        String hostAddress = host2.getHostAddress();
        System.out.println(hostAddress);//110.242.68.4

        //5.通过InetAddress对象，获取对应的主机名/域名
        String hostName1 = host1.getHostName();
        String hostName2 = host2.getHostName();
        System.out.println(hostName1);//LAPTOP-H6QEUGT3
        System.out.println(hostName2);//www.baidu.com
    }
}
