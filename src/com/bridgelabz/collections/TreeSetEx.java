package com.bridgelabz.collections;

import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(50);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(40);

        System.out.println("TreeSet (Sorted): " + treeSet);

        System.out.println("First Element: " + treeSet.first());
        System.out.println("Last Element: " + treeSet.last());

        treeSet.remove(30);
        System.out.println("TreeSet after removing 30: " + treeSet);

        System.out.println("Contains 20: " + treeSet.contains(20));

        System.out.println("Iterating through TreeSet:");
        for (Integer element : treeSet) {
            System.out.println(element);
        }

        System.out.println("HeadSet (elements < 40): " + treeSet.headSet(40));
        System.out.println("TailSet (elements >= 20): " + treeSet.tailSet(20));
    }
}

