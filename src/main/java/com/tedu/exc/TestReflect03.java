package com.tedu.exc;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class TestReflect03 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("k1",100);
        //所有的泛型在运行时都会转换成Object类型
        Class<?> cls = map.getClass();
        Method m = cls.getMethod("put",String.class,Integer.class);
        try {
            m.invoke(map,"k3",300);
        } catch (IllegalAccessException e) {
            System.out.println("111111");
            e.printStackTrace();
        }finally{
            System.out.println("测试finally");
        }
        System.out.println(map);


    }

}
