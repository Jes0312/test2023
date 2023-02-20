package com.tedu.exc;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LruCache extends LinkedHashMap<String,Object> {

    private int maxCap;

    public LruCache(int maxCap){
        super(maxCap,0.75f,true);
        this.maxCap = maxCap;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<String, Object> eldest) {

        return size()>maxCap;
    }
}
