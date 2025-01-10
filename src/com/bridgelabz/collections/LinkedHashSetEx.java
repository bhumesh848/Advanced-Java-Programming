package com.bridgelabz.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");

        System.out.println("LinkedHashSet: " + set);

        set.add("Apple");
        System.out.println("LinkedHashSet after adding duplicate: " + set);

        set.remove("Banana");
        System.out.println("LinkedHashSet after removing 'Banana': " + set);

        System.out.println("Contains 'Cherry': " + set.contains("Cherry"));

        System.out.println("Iterating through LinkedHashSet:");
        for (String element : set) {
            System.out.println(element);
        }
    }
}

