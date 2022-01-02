package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/**
 * @author 赵好运
 * @version 1.0
 **/
public class CollectionFor_ {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("红楼梦", "曹雪芹", 100));
        col.add(new Book("西游记", "吴承恩", 200));
        col.add(new Book("三国演义", "罗贯中", 300));
        System.out.println(col);

        //1.可以使用增强for循环
        //2.增强for循环底层使用的仍然是迭代器
        for (Object book : col) {
            System.out.println(book);
        }
    }
}
