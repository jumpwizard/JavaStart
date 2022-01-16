package com.hspedu.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author 赵好运
 * @version 1.0
 * 演示ObjectOutputStream的使用，完成数据的序列化
 **/
public class ObjectOutputStream_ {
    public static void main(String[] args) throws IOException {
        //序列化后，保存的文件格式不是存文本，而是按照它的格式来保存
        String filePath = "d:\\Game\\data.dat";

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));

        //序列化数据到文件
        objectOutputStream.writeInt(100);//int类型，文件中保存的是Integer对象，因为Integer实现了序列化接口
        objectOutputStream.writeBoolean(true);//boolean, Boolean
        objectOutputStream.writeChar('a');//char, Character
        objectOutputStream.writeDouble(1.1);//double, Double
        objectOutputStream.writeUTF("hello world");//String
        objectOutputStream.writeObject(new Dog("uzi",10, "black", "nation"));

        objectOutputStream.close();
        System.out.println("数据保存完毕");
    }
}
