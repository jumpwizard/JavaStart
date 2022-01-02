package com.hspedu.map_;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author 赵好运
 * @version 1.0
 **/
public class MapSource_ {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1", "zhy");
        map.put("no2", "wyt");

        //1.k-v最后是HashMap$Node node =  new Node<>(hash, key, value, next);
        //2.k-v为了方便程序员的遍历，还会创建Entry集合，该集合存放的元素的类型Entry，
        //  而一个Entry对象就有K，V; EntrySet<Entry<K,V>>即
        //  transient Set<Map.Entry<K,V>> entrySet
        //3.entrySet中，定义的类型是Map.Entry，但实际上存放的还是HashMap$Node
        //  这是因为static class Node<K,V> implements Map.Entry<K,V>
        //4.当把HashMap$Node对象存放到entrySet就方便我们的遍历，因为Map.Entry提供
        //  了重要方法，K getKey(); V getValue();
        Set set = map.entrySet();
        System.out.println(set.getClass());
        for (Object o : set) {
//            System.out.println(o.getClass());
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        Set set1 = map.keySet();
        System.out.println(set1.getClass());
        Collection values = map.values();
        System.out.println(values.getClass());
    }
}
