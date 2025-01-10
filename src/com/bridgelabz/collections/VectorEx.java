package com.bridgelabz.collections;

import java.util.Vector;
public class VectorEx {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Vector: " + numbers);

        System.out.println("First element: " + numbers.get(0));
        System.out.println("Second element: " + numbers.get(1));
        numbers.set(2, 35);
        System.out.println("After updating third element: " + numbers);


        numbers.remove(3);
        System.out.println("After removing fourth element: " + numbers);

        System.out.println("Does the Vector contain 20? " + numbers.contains(20));

        System.out.println("Size of the Vector: " + numbers.size());

        System.out.println("Iterating through the Vector:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        numbers.clear();
        System.out.println("After clearing, Vector: " + numbers);
    }
}

