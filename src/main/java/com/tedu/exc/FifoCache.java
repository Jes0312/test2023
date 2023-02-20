package com.tedu.exc;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class FifoCache {
    private int maxCap;
    private Map<String,Object> cache;
    private LinkedList<String> keyList;
    //构造方法
    public FifoCache(int maxCap){

        this.maxCap = maxCap;
        keyList=new LinkedList<String>();
        cache = new HashMap<String,Object>(maxCap);

    }

    public void put(String key,Object value){
        keyList.add(key);
        if (keyList.size()>maxCap){
            String firstKey = keyList.removeFirst();
            cache.remove(firstKey);
        }
        cache.put(key,value);
    }

    @Override
    public String toString() {
        return "FifoCache{" +
                "maxCap=" + maxCap +
                ", cache=" + cache +
                ", keyList=" + keyList +
                '}';
    }

    public static void main(String[] args) {
        FifoCache fc = new FifoCache(2);
        fc.put("A",100);
        fc.put("B",100);
        fc.put("C",100);
        System.out.println(fc);
    }



}
