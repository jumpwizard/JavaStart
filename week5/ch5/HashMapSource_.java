package com.hspedu.map_.hashmap_;

import java.util.HashMap;

/**
 * @author 赵好运
 * @version 1.0
 * Debug
 * 扩展：当底层满足条件（单条链表长度大于等于8，table容量大于等于64），并转成红黑树后
 * 若此时不断删减元素，会发生剪枝，即重新转换成数组+链表
 **/
public class HashMapSource_ {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("zhy", 10);
        hashMap.put("wyt", 10);
        hashMap.put("zhy", 20);
        System.out.println(hashMap);
    }
}
