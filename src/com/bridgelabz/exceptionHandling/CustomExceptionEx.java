package com.bridgelabz.exceptionHandling;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionEx {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above to vote.");
        } else {
            System.out.println("You are eligible to vote!");
        }
    }

    public static void main(String[] args) {
        int[] ages = {16, 20, 12, 25};

        for (int age : ages) {
            try {
                checkAge(age);
            } catch (InvalidAgeException e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
        }
    }
}

