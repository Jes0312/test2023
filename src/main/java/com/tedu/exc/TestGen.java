package com.tedu.exc;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class TestGen {

    public static void main(String[] args) throws Exception {
        List<String> lst = new ArrayList<String>();
        lst.add("A");
        //反射应用的起点Class类型对象
        //将整数100添加
        //1.获取list集合字节码对象
        Class<?> cLst =Class.forName("java.util.List");
        //或Class<?> cLst = lst.getClass();
        //2.获取list中的add方法对象
        //List<Integer> list = (List<Integer>)cLst.newInstance();
        Method m = cLst.getDeclaredMethod("add",Object.class);
        //3.反射执行list的add方法
        //因为泛型在运行时都会转为Object
        m.invoke(lst,100);
        //int是下标（参数可变）
        Method m1 = cLst.getDeclaredMethod("add",int.class,Object.class);
        m1.invoke(lst,0,100);
        System.out.println(lst);

    }


}
