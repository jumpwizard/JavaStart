package com.hspedu.list_.arraylist_;

import java.util.ArrayList;

/**
 * @author 赵好运
 * @version 1.0
 **/
public class ArrayListDetail  {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        //1.ArrayList 允许存储任何元素，包括空
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add("jack");
        System.out.println(arrayList);
        //2.ArrayList的底层是由数组来实现数据存储的
        //3.ArrayList基本等同于Vector，且效率比Vector更高，但没有实现线程安全

    }
}
