package com.hspedu.interface_.InterfacePoly_;

public class InterfacePolyArr_ {
    public static void main(String[] args) {
        //多态数组
        Usb[] usbs = new Usb[2];
        usbs[0] = new Phone_();
        usbs[1] = new Camera_();
        for (int i = 0; i < usbs.length; i++) {
            usbs[i].work();//动态绑定
            if (usbs[i] instanceof Phone_) {
                ((Phone_) usbs[i]).say();
            }
        }
    }
}
interface Usb {
    void work();
}
class Phone_ implements Usb{
    @Override
    public void work() {
        System.out.println("Phone正在工作...");
    }
    public void say() {
        System.out.println("手机负荷太大");
    }
}
class Camera_ implements Usb{
    @Override
    public void work() {
        System.out.println("相机正在工作...");
    }
}
