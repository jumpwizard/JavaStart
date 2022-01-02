package com.hspedu.list_;

import java.util.*;

/**
 * @author 赵好运
 * @version 1.0
 * list接口的三种遍历方式，其实现类（ArrayList,LinkedList,Vector）均可使用
 **/
public class ListFor_ {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();//向上转型
        list.add("zhy");
        list.add("yc");
        list.add("wyt");
        list.add("ckq");
        //1.使用迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        //2.使用增强for
        for (Object obj : list) {
            System.out.println(obj);
        }
        //3.使用for
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            System.out.println(obj);
        }

    }
}
