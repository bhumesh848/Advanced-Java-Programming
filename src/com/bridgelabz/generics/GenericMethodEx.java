package com.bridgelabz.generics;

public class GenericMethodEx {

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static <T, U> void printKeyValue(T key, U value) {
        System.out.println("Key: " + key + ", Value: " + value);
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.print("Integer Array: ");
        printArray(intArray);

        String[] strArray = {"Hello", "World", "Generics"};
        System.out.print("String Array: ");
        printArray(strArray);

        printKeyValue("ID", 101);
        printKeyValue(42, "Answer to Everything");
    }
}

