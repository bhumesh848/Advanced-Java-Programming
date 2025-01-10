package com.bridgelabz.exceptionHandling;

public class UncheckedExceptionEx {

    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an unchecked exception: Division by zero is not allowed!");
        }
    }
}

