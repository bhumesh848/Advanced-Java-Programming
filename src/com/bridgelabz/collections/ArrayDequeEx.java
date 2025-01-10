package com.bridgelabz.collections;

import java.util.ArrayDeque;

public class ArrayDequeEx {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        deque.add("rahul");
        deque.addFirst("Bhumesh");
        deque.addLast("sushant");

        System.out.println("Deque: " + deque);

        System.out.println("First element: " + deque.getFirst());
        System.out.println("Last element: " + deque.getLast());

        deque.removeFirst();
        deque.removeLast();

        System.out.println("Deque after removing first and last: " + deque);

        deque.push("shardul");
        deque.push("sahil");

        System.out.println("Deque after push: " + deque);
        System.out.println("Popped element: " + deque.pop());
        System.out.println("Final Deque: " + deque);
    }
}
