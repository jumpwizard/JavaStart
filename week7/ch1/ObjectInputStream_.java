package com.hspedu.inputstream;

import com.hspedu.outputstream.Dog;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author 赵好运
 * @version 1.0
 **/
public class ObjectInputStream_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //要读取的序列化文件，进行反序列化
        String filePath = "d:\\Game\\data.dat";

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath));

        //读取（反序列化）的顺序需要和保存（序列化）的顺序一致，否则会出现异常
        System.out.println(objectInputStream.readInt());
        System.out.println(objectInputStream.readBoolean());
        System.out.println(objectInputStream.readChar());
        System.out.println(objectInputStream.readDouble());
        System.out.println(objectInputStream.readUTF());
//        System.out.println(objectInputStream.readObject());//底层会把Object转型成Dog
        Object obj = objectInputStream.readObject();
        //若想这样手动完成转型并调用Dog对象的方法，必须能够访问到Dog类
        Dog dog = (Dog) obj;
        System.out.println(dog.toString());
        System.out.println(dog.getClass());
    }
}
