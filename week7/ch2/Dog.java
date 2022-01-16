package com.hspedu.outputstream;

import jdk.internal.org.objectweb.asm.commons.SerialVersionUIDAdder;

import javax.jws.Oneway;
import java.io.Serializable;

/**
 * @author 赵好运
 * @version 1.0
 * 序列化与反序列化的细节
 * 1.读写顺序要一致
 * 2.要求序列化或反序列化的对象，需要实现Serializable接口
 * 3.序列化的类中建议添加SerialVersionUID,为了提高版本的兼容性
 * 4.序列化对象时，默认将里面所有的属性都进行序列化，但除了static和transient修饰的成员
 * 5.序列化对象时，要求里面的属性的类型也需要实现了序列化接口
 * 6.序列化具备可继承性，如果某类已经实现了序列化，则其所有子类都默认实现了序列化
 **/
//如果需要序列化某个类的对象，实现序列化接口
public class Dog implements Serializable {
    private String name;
    private int age;
    private static String nation;
    //不能被序列化的标识符
    private transient String color;
    //序列化对象时，要求里面的属性的类型也需要实现了序列化接口
    private Master master = new Master();
    //序列化的版本号，可以提高兼容性
    private static final long serialVersionUID = 1L;

    public Dog(String name, int age, String color, String nation) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.nation = nation;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", nation=" + nation + '\'' +
                '}' + master;
    }
}
class Master implements Serializable{}