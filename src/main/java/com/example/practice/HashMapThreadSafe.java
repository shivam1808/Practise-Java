package com.example.practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapThreadSafe {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        // HashMap with a null key and value
        map.put(null, "Value for null key");
        map.put("Key1", null);
        map.put(null, "Value for null2 key");
        map.put("null", "Value for null String key");

        System.out.println("HashMap -> " + map);

        Map<String, Integer> synchronizedMap = Collections.synchronizedMap(new HashMap<>());

    }
}
