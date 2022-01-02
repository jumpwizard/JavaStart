package com.hspedu.map_;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 赵好运
 * @version 1.0
 * 1.Map与Collection并列存在.用于保存具有映射关系的数据：Key-Value
 * 2.Map中的Key和Value可以是任何引用类型的数据，会封装到HashMap$Node对象中
 * 3.Map中的Key不可以重复，原因和HashSet一样，底层是数组+链表+红黑树
 * 4.Map中的Value可以重复
 * 5.Map的Key可以是null，value也可以是null，但是Key中只能有一个是null
 * 6.常用String类作为Map的Key
 * 7.Key和Value存在单向的一对一关系，即通过Key总能找到唯一的Value
 * 8.HashMap的没有实现同步，线程不安全
 * 9.HashMap的扩容机制与HashSet完全相同，因为HashSet的底层就是HashMap
 **/
public class Map_ {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        //使用Map的实现类HashMap来演示
        Map map = new HashMap();
        map.put("no1", "zhy");
        map.put("no2", "wyt");
        map.put("no1", "lhj");//对key指向的value的替换机制
        map.put("no3", "lhj");
        map.put(null, null);
        map.put(null, null);
        map.put("null", null);
        System.out.println(map);
        System.out.println(map.get("no1"));
    }
}
