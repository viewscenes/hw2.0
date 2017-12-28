
package com.hw.common.constant;



import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;

public class LocalCache {

    public static Map map =new ConcurrentHashMap();
    public static Object  get(String key) throws ExecutionException {
        return map.get(key);
    }
    public static void set(Object key, Object value) {
        map.put(key, value);
    }
}
