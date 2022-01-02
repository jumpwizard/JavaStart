package com.hspedu.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 赵好运
 * @version 1.0
 **/
public class List_ {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        //list集合类中元素有序，即（添加顺序和取出顺序一致），且可重复
        List list = new ArrayList();//向上转型
        list.add("zhy");
        list.add("yc");
        list.add("wyt");
        list.add("ckq");
        System.out.println(list);
        //list集合类中的每个元素都有其对应的顺序索引，即支持索引
        System.out.println(list.get(2));
    }
}
