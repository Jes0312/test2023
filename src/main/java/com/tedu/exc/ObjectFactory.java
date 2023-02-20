package com.tedu.exc;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectFactory {

    public static <T>T newInstance01(Class<T> cls, Class<?>[] paramTypes, Object[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        Constructor<T> con = cls.getDeclaredConstructor(paramTypes);
        return con.newInstance(args);
    }
}
