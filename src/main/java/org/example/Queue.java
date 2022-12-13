package org.example;

import java.util.ArrayList;

public class Queue<T> {

    private ArrayList<T> queue = new ArrayList<>();

    public void enqueue(T item) {
        queue.add(item);
    }

    public T dequeue() {
        if(queue.isEmpty()) {
            return null;
        }
        return queue.remove(0);
    }

    public static void main(String[] args) {

        Queue<String> queue = new Queue<>();
        queue.enqueue("A");
        queue.enqueue("B");
        System.out.println(queue.dequeue());
        queue.enqueue("C");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
