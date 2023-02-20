package com.tedu.dataStruct.MapSty;

import java.util.*;

public class mapDemo {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("1",10);
        map.put("2",20);
        map.put("3",30);
        map.get("1");
        //得到当前map所有的value
        Collection<Integer> vs = map.values();
        //得到所有的key
        Set<String> ks = map.keySet();
        System.out.println(vs);
        System.out.println(ks);
        //把map的key和value放到entry中，entry再放到set中
        Set<Map.Entry<String,Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String,Integer>> it = entries.iterator();
        //遍历Entry可以用iterator
        while(it.hasNext()){

            Map.Entry<String,Integer> next = it.next();
            String key = next.getKey();
            Integer value = next.getValue();

        }

    }























}
