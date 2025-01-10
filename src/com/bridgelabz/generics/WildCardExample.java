package com.bridgelabz.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardExample {

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public static void addIntegers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        System.out.print("String List: ");
        printList(stringList);

        List<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(15);
        intList.add(25);
        System.out.println("Sum of Numbers (Integer List): " + sumNumbers(intList));

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(5.5);
        doubleList.add(10.5);
        System.out.println("Sum of Numbers (Double List): " + sumNumbers(doubleList));

        List<Number> numberList = new ArrayList<>();
        addIntegers(numberList);
        System.out.print("Number List after adding Integers: ");
        printList(numberList);
    }
}
