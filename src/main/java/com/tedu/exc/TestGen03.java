package com.tedu.exc;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class TestGen03 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1、构建日志对象
        SysLog log = new SysLog();
        log.setId(100);
        log.setUsername("wanghaitao");
        //2、对象序列化
        ObjectOutputStream out =
                new ObjectOutputStream(new FileOutputStream("f1.data"));

        out.writeObject(log);
        out.close();
        System.out.println("序列化ok");
        //3、对象反序列化
        ObjectInputStream in =
                new ObjectInputStream(new FileInputStream("f1.data"));
        Object obj = in.readObject();
        in.close();
        System.out.println(obj);

    }



}
