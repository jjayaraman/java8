package com.jai.java8.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class HelloThread {

    int priority = Thread.MIN_PRIORITY;

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(11);

        HelloThread thread = new HelloThread();
        for (int i = 0; i < 10; i++) {
            thread.createThread();
        }
        try {
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }

        System.out.println("end..");
    }

    private void createThread() {
        MyThread myThread = new MyThread();
        myThread.setPriority(priority++);

        myThread.start();
    }
}


class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("Thread running...." + Thread.currentThread().toString());
    }
}