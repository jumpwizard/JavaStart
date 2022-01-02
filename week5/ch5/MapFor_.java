package com.hspedu.map_;

import com.sun.deploy.panel.ITreeNode;

import java.util.*;

/**
 * @author 赵好运
 * @version 1.0
 **/
public class MapFor_ {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("zhy", new Book("qzfs"));
        map.put("zhy", "wyt");
        map.put("yc", "ff");
        map.put("wyt", "ff");
        map.put("ckq", null);
        map.put(null, null);
        //方式1：先取出所有的key，再通过key，取出对应的value
        Set keyset = map.keySet();
//        //(1)增强for
//        for (Object o : keyset) {
//            System.out.println(o + "-" + map.get(o));
//        }
        //(2)迭代器
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            System.out.println(o + "-" + map.get(o));
        }
        //方式2：把所有的values取出
        Collection values = map.values();
        //可以使用所有的Collection使用的遍历方法
        //迭代器，增强for。

        //方式3：通过EntrySet来获取k-v
        System.out.println("-----------------------");
        Set entrySet = map.entrySet();
        //(1)增强for
        for (Object o : entrySet) {
            Map.Entry m = (Map.Entry) o;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
        //(2)迭代器
        System.out.println("-----------------------");
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Object o = iterator1.next();
            Map.Entry m = (Map.Entry) o;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
    }
}
