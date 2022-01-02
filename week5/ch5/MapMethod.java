package com.hspedu.map_;

import java.util.HashMap;
import java.util.Map;
import java.util.SplittableRandom;

/**
 * @author 赵好运
 * @version 1.0
 **/
public class MapMethod {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Map map = new HashMap();
        //1.put,添加
        map.put("zhy", new Book("qzfs"));
        map.put("zhy", "wyt");
        map.put("yc", "ff");
        map.put("wyt", "ff");
        map.put("ckq", null);
        map.put(null, null);
        System.out.println(map);
        //2.remove，根据键值删除
        map.remove(null);
        System.out.println(map);
        //3.get,根据键值获取
        System.out.println(map.get("zhy"));
        //4.size,返回元素个数
        System.out.println(map.size());
        //5.isEmpty,判断是否为空
        System.out.println(map.isEmpty());
        //6.clear,清空
        map.clear();
        System.out.println(map);
        //7.containskey，查找键值对是否存在
        System.out.println(map.containsKey("zhy"));
    }
}
class Book {
    private String name;

    public Book(String name) {
        this.name = name;
    }
}