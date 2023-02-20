package com.tedu.dataStruct.comparaTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<Student1> lst = new ArrayList<>();
        lst.add(new Student1("lily",20));
        lst.add(new Student1("tom",18));
        lst.add(new Student1("terry",28));
        //通过Collections工具类的sort方法进行排序
        Collections.sort(lst, new Comparator<Student1>() {
            @Override
            public int compare(Student1 o1, Student1 o2) {
                return o1.age-o2.age;
            }
        });
        System.out.println(lst);
    }
}
