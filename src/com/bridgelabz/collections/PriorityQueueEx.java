package com.bridgelabz.collections;

import java.util.PriorityQueue;
public class PriorityQueueEx {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(40);
        pq.add(10);
        pq.add(20);
        pq.add(30);

        System.out.println("PriorityQueue: " + pq);

        System.out.println("Head element: " + pq.peek());

        System.out.println("Removed element: " + pq.poll());
        System.out.println("PriorityQueue after poll: " + pq);

        System.out.println("Iterating through the PriorityQueue:");
        for (Integer element : pq) {
            System.out.println(element);
        }
    }
}

