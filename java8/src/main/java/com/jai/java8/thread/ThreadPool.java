package com.jai.java8.thread;

import java.util.concurrent.*;

public class ThreadPool {

    public static void main(String[] args) {
        ThreadPool threadPool = new ThreadPool();
//        threadPool.singleThreadExecutor();
        //threadPool.fixedThreadPool();
        threadPool.scheduledThreadPool();
    }


    private void singleThreadExecutor() {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.submit(new FirstThread());
        executorService.submit(new FirstThread());
        executorService.submit(new FirstThread());
        executorService.shutdown();
    }


    private void fixedThreadPool() {

        ThreadPoolExecutor executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);

        executorService.submit(new FirstThread());
        executorService.submit(new FirstThread());
        executorService.submit(new FirstThread());
        executorService.submit(new FirstThread());
        executorService.submit(new FirstThread());
        executorService.submit(new FirstThread());
        executorService.submit(new FirstThread());

        System.out.println(executorService.getQueue().size());
        System.out.println(executorService.getPoolSize());

        executorService.shutdown();

    }


    private void scheduledThreadPool() {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
        scheduledExecutorService.submit(new FirstThread());
        scheduledExecutorService.schedule(new FirstThread(), 2, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleAtFixedRate(new FirstThread(), 5, 2, TimeUnit.SECONDS);

//        scheduledExecutorService.shutdown();
    }
}

class FirstThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}
