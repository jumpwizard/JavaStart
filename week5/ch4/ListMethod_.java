package com.hspedu.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 赵好运
 * @version 1.0
 **/
public class ListMethod_ {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("zhy");
        list.add("yc");
        list.add("wyt");
        list.add("ckq");
        System.out.println(list);
        //1.在索引处插入
        list.add(1, "lyf");
        System.out.println(list);
        //2.添加多个,可按索引
        List list2 = new ArrayList();
        list2.add("红楼梦");
        list2.add("西游记");
        list.addAll(0, list2);
        System.out.println(list);
        //3.indexOf,返回首次出现的索引
        System.out.println(list.indexOf("wyt"));
        //4.lastIndexOf,返回首次出现的索引
        list.add("wyt");
        System.out.println(list);
        System.out.println(list.lastIndexOf("wyt"));
        //5.移除指定位置的元素
        list.remove(1);
        System.out.println(list);
        //6.设置指定索引位置的元素，类似于替换
        list.set(0, "lhl");
        System.out.println(list);
        //7.返回指定的子集合，前闭后开
        System.out.println(list.subList(0,2));
    }
}
