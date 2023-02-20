package com.tedu.exc;

import java.util.HashMap;
import java.util.Map;

public class PerpetualCache implements Cache{

    private Map<Object,Object> cache = new HashMap<Object,Object>();

    @Override
    public void putObject(Object key, Object value) {
        cache.put(key,value);
    }

    @Override
    public Object getObject(Object key) {
        return cache.get(key);
    }

    @Override
    public Object removeObject(Object key) {
        return cache.remove(key);
    }
}
