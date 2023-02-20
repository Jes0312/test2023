package com.tedu.exc;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.annotation.Annotation;
import java.util.Arrays;


public class Test1{
    private String name = "toy";

    public static void main(String args[ ]) throws ClassNotFoundException {
        Class<?> cls = Class.forName("com.tedu.exc.Student");
        Annotation[] as = cls.getDeclaredAnnotations();
        for(Annotation a:as){
            System.out.println(a.toString());

        }
        Controller c = cls.getAnnotation(Controller.class);
        System.out.println(c);
        System.out.println(c.value());


    }



}