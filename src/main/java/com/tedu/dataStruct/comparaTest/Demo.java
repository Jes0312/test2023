package com.tedu.dataStruct.comparaTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Student> lst = new ArrayList<>();
        lst.add(new Student("lily",20));
        lst.add(new Student("tom",18));
        lst.add(new Student("terry",28));
        //通过Collections工具类的sort方法进行排序
        Collections.sort(lst);
        System.out.println(lst);
    }
}
