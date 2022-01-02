package com.hspedu.map_.TreeMap_;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author 赵好运
 * @version 1.0
 * 基本与map接口一致
 **/
public class TreeMap_ {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        //默认构造器仍是无序的
//        TreeMap treeMap = new TreeMap();
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //按照字符串大小 进行排序
                return ((String) o1).compareTo((String) o2);
            }
        });
        treeMap.put("zhy", 100);
        treeMap.put("wyt", 200);
        treeMap.put("ckq", 300);
        treeMap.put("yc", 400);
        treeMap.put("zhy", 200);//重复的会替换
        System.out.println(treeMap);
    }
}
