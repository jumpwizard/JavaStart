package com.hspedu.generic.customgeneric;

/**
 * @author 赵好运
 * @version 1.0
 * 自定义泛型接口
 * 1.接口中，静态成员也不能使用泛型（和泛型类规定一样）
 * 2.泛型接口的类型，在继承接口或实现接口时确定
 * 3.没有指定类型，默认为Object(可以指定为Object，但不推荐不指定)
 **/
public class CustomInterfaceGeneric {
    public static void main(String[] args) {

    }
}
interface IUsb<U, R> {
    //普通方法中，可以使用接口泛型
    void hi(R r);//抽象方法
    void run(R r, U u);

    //在jdk8中，可以在接口中使用默认方法,也是可以使用泛型
    default R method(U u) {//默认方法
        return null;
    }
}
interface IA extends IUsb<String, Double> {}
class AA implements IA {
    @Override
    public void hi(Double aDouble) {

    }

    @Override
    public void run(Double aDouble, String s) {

    }

//    @Override
//    public Double method(String s) {
//        return IA.super.method(s);
//    }
}
class BB implements IUsb<String, Float> {
    @Override
    public void hi(Float aFloat) {

    }

    @Override
    public void run(Float aFloat, String s) {

    }
}
class CC implements IUsb {
    @Override
    public void hi(Object o) {

    }

    @Override
    public void run(Object o, Object o2) {

    }
}