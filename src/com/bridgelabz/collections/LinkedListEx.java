package com.bridgelabz.collections;


import java.util.LinkedList;
public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        names.add("Rohan");
        names.add("sahil");
        names.add("amir");
        names.add("sushant");

        System.out.println("LinkedList: " + names);

        names.addFirst("Bhumesh");
        names.addLast("ranjane");
        System.out.println("After adding first and last: " + names);

        System.out.println("First element: " + names.getFirst());
        System.out.println("Last element: " + names.getLast());

        names.removeFirst();
        names.removeLast();
        System.out.println("After removing first and last: " + names);

        names.set(1, "Virat");
        System.out.println("After updating second element: " + names);

        for (String name : names) {
            System.out.println("Name: " + name);
        }
    }
}
