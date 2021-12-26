package com.hspedu.codeblock_;

public class CodeBlock01 {
    public static void main(String[] args) {
        //代码块相当于另一种形式的构造器（对构造器的补充机制），可以做初始化操作
        //如果多个构造器中有重复的语句，可以抽取到代码块中，提高代码的重用性
        //构造器运行会先调用代码块
        Movie movie = new Movie("伤物语");
    }
}
class Movie {
    private String name;
    private double price;
    private String director;
    //代码块
    {
        System.out.println("电影屏幕打开");
        System.out.println("广告开始");
        System.out.println("电影开始");
    };
    //构造器
    public Movie(String name) {
//        System.out.println("电影屏幕打开");
//        System.out.println("广告开始");
//        System.out.println("电影开始");
        System.out.println("构造器1被调用");
        this.name = name;
    }
    public Movie(String name, double price) {
//        System.out.println("电影屏幕打开");
//        System.out.println("广告开始");
//        System.out.println("电影开始");
        this.name = name;
        this.price = price;
    }
    public Movie(String name, double price, String director) {
//        System.out.println("电影屏幕打开");
//        System.out.println("广告开始");
//        System.out.println("电影开始");
        this.name = name;
        this.price = price;
        this.director = director;
    }
}
