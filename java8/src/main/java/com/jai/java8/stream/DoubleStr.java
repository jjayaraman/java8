package com.jai.java8.stream;

import java.util.stream.DoubleStream;

public class DoubleStr {

    public static void main(String[] args) {

        System.out.println(DoubleStream.of(1, 2, 3, 4, 5, 10).count());
        System.out.println(DoubleStream.of(1, 2, 3, 4, 5, 10).max());
        System.out.println(DoubleStream.of(1, 2, 3, 4, 5, 10).min());
        System.out.println(DoubleStream.of(1, 2, 3, 4, 5, 10).average());
        System.out.println(DoubleStream.of(1, 2, 3, 4, 5, 10).summaryStatistics());
        System.out.println(DoubleStream.of(1, 2, 3, 4, 5, 10).distinct());
        System.out.println(DoubleStream.of(1, 2, 3, 4, 5, 10).findFirst());

    }
}
