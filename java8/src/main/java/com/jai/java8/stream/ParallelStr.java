package com.jai.java8.stream;

import org.springframework.util.StopWatch;

import java.util.stream.LongStream;

public class ParallelStr {

    public static void main(String[] args) {
        ParallelStr parallelStr = new ParallelStr();
        StopWatch stopWatch = new StopWatch();

        stopWatch.start();
        parallelStr.parallel();

        stopWatch.stop();

//        stopWatch.start();
//        parallelStr.serial();
//        stopWatch.stop();


        System.out.println(stopWatch.prettyPrint());
    }

    public void serial() {
        System.out.println(LongStream.range(1, 1000000000).sum());
    }

    public void parallel() {
        System.out.println(LongStream.range(1, 1000000000).parallel().sum());
    }
}
