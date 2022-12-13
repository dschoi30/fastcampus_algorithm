package org.example;

import java.util.ArrayList;

public class Stack<T> {

    private ArrayList<T> stack = new ArrayList<>();

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if(stack.isEmpty()) {
            return null;
        }
        return stack.remove(stack.size() - 1);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
