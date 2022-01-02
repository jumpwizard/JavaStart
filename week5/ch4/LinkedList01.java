package com.hspedu.list_.linkedlist_;

/**
 * @author 赵好运
 * @version 1.0
 * LinkList底层实现了双向链表和双端队列，但线程不安全
 * 模拟一个简单的双向链表
 **/
public class LinkedList01 {
    //1.LinkedList底层维护了一个双向链表
    //2.LinkedList中维护了两个属性first和last分别指向首结点和尾结点
    //3.每个节点（node对象）里面又维护了prev，next，item三个属性
    //4.LinkedList的删除和添加，不是通过数组来完成的，相对来说效率较高
    public static void main(String[] args) {
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node zhy = new Node("zhy");
        //连接双向链表
        jack.next = tom;
        tom.next = zhy;
        zhy.pre = tom;
        tom.pre =jack;

        Node first = jack;
        Node last = zhy;

        //遍历
        while (true) {
            if (first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;
        }
    }
}
class Node {
    public Object item;//存放对象数据
    public Node next;
    public Node pre;

    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Node name = " + item;
    }
}
