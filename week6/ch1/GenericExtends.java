package com.hspedu.generic.customgeneric;


import java.util.ArrayList;
import java.util.List;

/**
 * @author 赵好运
 * @version 1.0
 * 泛型的继承和通配符说明
 * 1.泛型不具备继承性
 * 2.<?>:支持任意泛型类型
 * 3.<? extends A>: 支持A类以及A类的子类，规定了泛型的上限
 * 4.<? super A>: 支持A类以及A类的父类，不限于直接父类，规定了泛型的下限
 **/
public class GenericExtends {
    public static void main(String[] args) {
        Object o = new String("xx");
        //泛型不具备继承性
//        List<Object> list = new ArrayList<String>();
        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<AAA> list3 = new ArrayList<>();
        List<BBB> list4 = new ArrayList<>();
        List<CCC> list5 = new ArrayList<>();
        //<?>:支持任意泛型类型
        printCollection1(list1);
        printCollection1(list2);
        printCollection1(list3);
        printCollection1(list4);
        printCollection1(list5);
        //<? extends AAA>:支持AAA类及其子类
//        printCollection2(list1);
//        printCollection2(list2);
        printCollection2(list3);
        printCollection2(list4);
        printCollection2(list5);
        //<? super AAA>:支持AAA类及其父类，不限于直接父类
        printCollection3(list1);
//        printCollection3(list2);
        printCollection3(list3);
//        printCollection3(list4);
//        printCollection3(list5);
    }
    //<?>:支持任意泛型类型
    public static void printCollection1(List<?> c) {
        for (Object o : c) {
            System.out.println(o);
        }
    }
    //<? extends AAA>:支持AAA类及其子类
    public static void printCollection2(List<? extends AAA> c) {
        for (Object o : c) {
            System.out.println(o);
        }
    }
    //<? super AAA>:支持AAA类及其父类，不限于直接父类
    public static void printCollection3(List<? super AAA> c) {
        for (Object o : c) {
            System.out.println(o);
        }
    }
}
class AAA {}
class BBB extends AAA {}
class CCC extends BBB {}
