package com.jai.java8.util;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyDeque {

    private Deque deque = new ArrayDeque();

    public void init() {
        deque = new ArrayDeque();
        deque.addFirst("1");
        deque.addFirst("2");
        deque.addFirst("3");
        deque.addFirst("4");
        deque.addFirst("5");
    }

    public void queue() {
        init();
        System.out.println("As a queue" + deque);

        // Stack
        while (deque.size() > 0) {
            System.out.println(deque.pollLast());
        }
        System.out.println("isEmpty : " + deque.isEmpty());
    }


    //
    public void stack() {
        init();
        System.out.println("As a stack" + deque);

        // Stack
        while (deque.size() > 0) {
            System.out.println(deque.pollFirst());
        }
        System.out.println("isEmpty : " + deque.isEmpty());
    }


    public static void main(String[] args) {
        MyDeque myDeque = new MyDeque();
        myDeque.queue();
        myDeque.stack();
    }
}
