package com.bridgelabz.exceptionHandling;

public class TryCatchEx {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        try {
            System.out.println("Accessing element at index 3: " + numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues after handling the exception.");
    }
}
