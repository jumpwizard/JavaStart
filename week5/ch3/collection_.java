package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/**
 * @author 赵好运
 * @version 1.0
 **/
public class collection_ {
    public static void main(String[] args) {
        //1.集合主要是两组（单列集合，双列集合）
        //2.Collection接口有两个重要的子接口，List，Set，他们的实现子类都是单列集合
        //3.Map接口的实现子类是双列集合，存放的 Key-value
        ArrayList arrayList = new ArrayList();
        arrayList.add("jack");

        HashMap hashMap = new HashMap();
        hashMap.put("0", "tencent");
        hashMap.put("1", "ali");

    }
}
