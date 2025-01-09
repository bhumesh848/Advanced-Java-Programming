package com.bridgelabz.exceptionHandling;

public class MultipleExceptionExample {

    public static void main(String[] args) {
        try {
            int result = 10 / 0;

            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues after handling exceptions.");
    }
}

