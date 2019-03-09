package com.jai.java8.thread;

public class Deadlock2 {

    static String s1 = "one";
    static String s2 = "two";


    Thread t1 = new Thread() {
        @Override
        public void run() {
            while (true) {
                synchronized (s1) {
                    System.out.println("Thread 1 locked s1");
                    synchronized (s2) {
                        System.out.println("Thread 1 locked s2");
                    }
                }
            }
        }
    };

    Thread t2 = new Thread() {

        public void run() {
            while (true) {
                synchronized (s2) {
                    System.out.println("Thread 2 locked s2");
                    synchronized (s1) {
                        System.out.println("Thread 2 locked s1");
                    }
                }

            }
        }
    };

    public static void main(String[] args) {

        Deadlock2 deadlock = new Deadlock2();
        deadlock.t1.start();
        deadlock.t2.start();
    }


}
