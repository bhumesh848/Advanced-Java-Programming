package com.bridgelabz.collections;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);
        map.put("Date", 40);

        System.out.println("LinkedHashMap: " + map);

        map.put("Apple", 50);
        System.out.println("LinkedHashMap after updating Apple: " + map);

        map.remove("Banana");
        System.out.println("LinkedHashMap after removing Banana: " + map);

        System.out.println("Value associated with Cherry: " + map.get("Cherry"));

        System.out.println("Checking if 'Date' exists: " + map.containsKey("Date"));
        System.out.println("Checking if value 40 exists: " + map.containsValue(40));

        System.out.println("Iterating through LinkedHashMap:");
        for (String key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }
    }
}
