package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author 赵好运
 * @version 1.0
 **/
public class CollectionIterator_ {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("红楼梦", "曹雪芹", 100));
        col.add(new Book("西游记", "吴承恩", 200));
        col.add(new Book("三国演义", "罗贯中", 300));
        System.out.println(col);

        //若想遍历col集合
        //1.得到col对应的迭代器
        Iterator iterator = col.iterator();
        //使用while循环遍历
        while (iterator.hasNext()) {//判断是否还有数据
            //返回下一个元素
            Object obj = iterator.next();//向上转型
            System.out.println(obj);
        }
        //显示所有快捷键的快捷键，Ctrl + j
        //当退出while循环后，迭代器指向最后的元素，
        //iterator.next()会报错
        //若想再次遍历，需要重置我们的迭代器
        iterator = col.iterator();

    }
}
class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}