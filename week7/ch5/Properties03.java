package com.hspedu.properties_;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author 赵好运
 * @version 1.0
 * 使用Properties来创建配置文件，修改配置文件内容
 **/
public class Properties03 {
    public static void main(String[] args) throws IOException {
        //Properties的底层就是hashtable
        Properties properties = new Properties();
        //创建与修改
        //1.如果该文件没有该key，就是创建
        //2.如果有该key，就是修改
        //底层是在properties中存储了三对键值对k-v，之后再写进文件
        properties.setProperty("charset", "uft8");
        properties.setProperty("user", "赵好运");//保存中文时，保存的是中文的Unicode码
        properties.setProperty("pwd", "123456");
        properties.setProperty("pwd", "1344033");

        //将k-v存储到文件中即可, 后边是可以自动生成的注释
        properties.store(new FileOutputStream("src\\mysql2.properties"), "test");
        System.out.println("保存配置文件成功");
    }
}
