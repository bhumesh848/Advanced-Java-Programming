package com.bridgelabz.collections;

import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");

        System.out.println("HashSet: " + set);

        set.add("Apple");
        System.out.println("HashSet after adding duplicate: " + set);

        set.remove("Banana");
        System.out.println("HashSet after removing 'Banana': " + set);

        System.out.println("Contains 'Cherry': " + set.contains("Cherry"));

        System.out.println("Iterating through HashSet:");
        for (String element : set) {
            System.out.println(element);
        }
    }
}
