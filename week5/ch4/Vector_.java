package com.hspedu.list_.vector_;

import java.util.Vector;

/**
 * @author 赵好运
 * @version 1.0
 **/
public class Vector_ {
    //1.Vector底层也是Object对象数组，protected Object[] elementData
    //2.Vector是线程同步的，即线程安全的，其方法带有synchronized
    //3.需要考虑线程同步安全时，使用Vector，没有线程安全的问题时，使用ArrayList
    @SuppressWarnings("all")
    public static void main(String[] args) {
        //无参构造器默认给数组10个空间
        Vector vector = new Vector();
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        vector.add(10);
    }
}
