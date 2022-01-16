package com.hspedu.properties_;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author 赵好运
 * @version 1.0
 * 使用Properties类来读取Properties文件内容
 **/
public class Properties02 {
    public static void main(String[] args) throws IOException {
        //1.创建Properties对象
        Properties properties = new Properties();
        //2.加载指定配置文件
        properties.load(new FileReader("src\\mysql.properties"));
        //3.把k-v显示在控制台
        properties.list(System.out);

        //根据k得到对应的v
        String user = properties.getProperty("user");
        System.out.println(user);
    }
}
