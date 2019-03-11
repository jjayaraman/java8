package com.jai.java8.stream;

import java.util.stream.LongStream;

public class LongStr {

    public static void main(String[] args) {

        System.out.println(LongStream.of(1l, 2l, 3l, 4, 5, 10).count());

        System.out.println(LongStream.range(1, 10).count());
        System.out.println(LongStream.range(1, 10).max());
        System.out.println(LongStream.range(1, 10).min());
        System.out.println(LongStream.range(1, 10).average());
        System.out.println(LongStream.range(1, 1000).summaryStatistics());
        System.out.println(LongStream.range(1, 10).distinct());
        System.out.println(LongStream.range(1, 10).findFirst());

    }
}
