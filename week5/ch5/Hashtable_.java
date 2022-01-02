package com.hspedu.map_.hashtable_;

import java.util.Hashtable;

/**
 * @author 赵好运
 * @version 1.0
 * 1.存放的元素是键值对K-V
 * 2.HashTable的键和值都不能为null，否则会抛出异常
 * 3.HashTable的使用方法，基本上和HashMap一致
 * 4.HashTable是线程安全的，HashMap线程不安全
 **/
public class Hashtable_ {
    //1.底层有数组Hashtable$Entry{}，初始化大小为11
    //2.临界值：11 * 0.75 = 8
    //3.按照自己的扩容机制：旧容量 * 2 + 1
    //扩容底层是创建一个新容量的表，并逐一复制进去
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("no1", "zhy");
        hashtable.put("no2", "wyt");
        hashtable.put("no1", "lhj");//对key指向的value的替换机制
        hashtable.put("no3", "lhj");
        hashtable.put("no4", "lhj");
        hashtable.put("no5", "lhj");
        hashtable.put("no6", "lhj");
        hashtable.put("no7", "lhj");
        hashtable.put("no8", "lhj");
        hashtable.put("no9", "lhj");
        hashtable.put("no10", "lhj");
//        hashtable.put("no4", null);//报错
//        hashtable.put(null, "ckq");//报错
        System.out.println(hashtable);
    }
}
