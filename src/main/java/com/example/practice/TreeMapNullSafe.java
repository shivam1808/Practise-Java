package com.example.practice;

import java.util.*;

public class TreeMapNullSafe {

    public static void main(String[] args) {
        // TreeMap with a null key and value
        TreeMap<String, String> treeMap = new TreeMap<>(Comparator.nullsLast(Comparator.naturalOrder()));

        treeMap.put(null, "Value for null key");
        treeMap.put("Key1", null);
        treeMap.put(null, "Value for null2 key");
        treeMap.put("null", "Value for null String key");

        /*
            TreeMap with built-in classes, it will throw a null pointer exception for a null key
            as it uses compareTo method, and it expects a non-null key.
        */

        System.out.println("TreeMap -> " + treeMap);

        System.out.println("Fetch Null key -> " + treeMap.get(null));
        System.out.println("Fetch Null String key -> " + treeMap.get("null"));

    }
}
