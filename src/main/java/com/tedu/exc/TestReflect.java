package com.tedu.exc;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

class Problem{
    private Long id;
    private String title;
    private Date createdTime;
    public Problem(Long id){
        this.id=id;
    }
    public Problem(Long id,String title,Date createdTime){
        this.id=id;
        this.title=title;
        this.createdTime=createdTime;
    }
}

public class TestReflect {
    public static void main(String[] args) throws Exception {
        Class<?> c = Class.forName("com.tedu.exc.Problem");
        //基于方式一创建类的实例
        //doCreate01(c);
        //方式二,获取所有的构造函数getDelcaredConstructor
        //Constructor<?> con = c.getDeclaredConstructor();
        //con.setAccessible(true);
        //Object obj = con.newInstance();
        //System.out.println(obj);
        //方式三
        doCreate03(c,Long.class,10L);
        //方式四
        Problem p = (Problem)ObjectFactory.newInstance01(c,new Class<?>[]{Long.class,String.class,Date.class},new Object[]{100L,"反射问题",new Date()});

        System.out.println(p);
        Date d = (Date)ObjectFactory.newInstance01(Date.class,null,null);
        System.out.println(d);

    }

    private static void doCreate04() {

    }

    private static void doCreate03(Class<?> cls,Class<?> paramTypes,Long id) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<?> con = cls.getDeclaredConstructor(paramTypes);
        con.setAccessible(true);
        Object obj = con.newInstance(id);
        System.out.println(obj);

    }

    public static void doCreate01(Class<?> cls) throws Exception {
        Problem p = (Problem)cls.newInstance();
        System.out.println(p);
    }



}



