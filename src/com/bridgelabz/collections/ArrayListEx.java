package com.bridgelabz.collections;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Bhumesh");
        names.add("sahil");
        names.add("sushant");
        names.add("bhavesh");

        System.out.println("Names in the list: " + names);

        System.out.println("First name: " + names.get(0));
        System.out.println("Second name: " + names.get(1));

        names.set(2, "prasad");
        System.out.println("Updated list: " + names);

        names.remove(3);
        System.out.println("After removing Bhavesh: " + names);
        System.out.println("Is shardul in the list? " + names.contains("shardul"));

        System.out.println("Number of names in the list: " + names.size());

        System.out.println("Iterating through the list:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
