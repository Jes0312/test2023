package com.tedu.exc;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

class Pool{
    @Value("1")
    private int coreSize;

    public int getCoreSize(){
        return coreSize;
    }
}

public class TestReflect02 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException {
        //1、通过反射构建Pool类的对象
        Class<?> cls = Class.forName("com.tedu.exc.Pool");
        //类对象
        Pool p = ObjectFactory.newInstance01(Pool.class,null,null);
        //2、通过反射为Pool对象的coreSize属性赋值
        Field f = cls.getDeclaredField("coreSize");

        Value v = f.getDeclaredAnnotation(Value.class);

        if(!f.isAccessible()){



        }
        f.set(p,Integer.parseInt(v.value()));

    }

}
