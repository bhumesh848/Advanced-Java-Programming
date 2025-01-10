package com.bridgelabz.collections;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        stack.push("Date");

        System.out.println("Stack: " + stack);
        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());

        System.out.println("Stack after pop: " + stack);

        System.out.println("Is the stack empty? " + stack.isEmpty());

        System.out.println("Position of 'Banana': " + stack.search("Banana"));

        System.out.println("Iterating through the stack:");
        for (String element : stack) {
            System.out.println(element);
        }
    }
}

