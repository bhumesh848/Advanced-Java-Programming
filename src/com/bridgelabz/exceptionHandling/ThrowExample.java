package com.bridgelabz.exceptionHandling;

public class ThrowExample {

    public static void checkEligibility(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote.");
        } else {
            System.out.println("You are eligible to vote!");
        }
    }

    public static void main(String[] args) {
        try {
            checkEligibility(20);
            checkEligibility(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues after handling the exception.");
    }
}

