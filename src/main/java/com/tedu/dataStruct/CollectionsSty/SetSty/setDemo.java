package com.tedu.dataStruct.CollectionsSty.SetSty;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setDemo {

    public static void main(String[] args) {
        Set<String> set = new HashSet();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");
        set.add("5");
        //set是无序的，无法使用get()取值。
        //使用iterator取值
        Iterator<String> it = set.iterator();
        //iterator接口有两个方法
        //判断是否有下一个元素
        while(it.hasNext()){
            String nx = it.next();
            it.remove();
            System.out.println(nx);
        }
        //增强for循环
        for(String s:set){
            System.out.println(s);
        }
    }
}
