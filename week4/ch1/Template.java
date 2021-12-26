package com.hspedu.abstract_;
//抽象设计方法
abstract public class Template {

    public abstract void job();

    public void calculateTime() {
        //得到开始时间
        long start = System.currentTimeMillis();
        job();
        //得到结束时间
        long end = System.currentTimeMillis();
        System.out.println("执行时间：" + (end - start));
    }
}
class A extends Template {
    @Override
    public void job() {
        int num = 0;
        for (int i = 0; i < 10000; i++) {
            num = num + i;
        }
    }
}
class B extends Template {
    @Override
    public void job() {
        int num = 0;
        for (int i = 0; i < 100000; i++) {
            num = num + i;
        }
    }
}
