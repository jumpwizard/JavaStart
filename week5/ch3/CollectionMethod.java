package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 赵好运
 * @version 1.0
 **/
public class CollectionMethod {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        //接口不能创建实例，所以用其实现子类来演示其方法
        List list = new ArrayList();//向上转型
        //1.add，添加单个元素,添加的是对象
        list.add("jack");
        list.add(10);//本质：list.add(new Integer(10))
        list.add(true);
        System.out.println(list);
        //2.remove,删除指定元素
        list.remove(0);
        list.remove(true);
        System.out.println(list);
        //3.contains:查找元素是否存在
        System.out.println(list.contains(10));
        //4.size 获取元素个数
        System.out.println(list.size());
        //5.isEmpty 判断是否为空
        System.out.println(list.isEmpty());
        //6.clear清空
        list.clear();
        System.out.println(list.size());
        //7.addAll,添加多个元素
        ArrayList arrayList = new ArrayList();
        arrayList.add("红楼梦");
        arrayList.add("西游记");
        list.addAll(arrayList);
        System.out.println(list);
        //8.containsAll,查找多个元素是否都存在
        System.out.println(list.containsAll(arrayList));
        //9.removeAll，删除多个元素
        list.removeAll(arrayList);
        System.out.println(list.size());
    }
}
