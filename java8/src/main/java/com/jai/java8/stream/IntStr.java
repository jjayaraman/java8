package com.jai.java8.stream;

import java.util.stream.IntStream;

public class IntStr {

    public static void main(String[] args) {


        System.out.println(IntStream.range(1, 10).count());
        System.out.println(IntStream.range(1, 10).max());
        System.out.println(IntStream.range(1, 10).min());
        System.out.println(IntStream.range(1, 10).average());
        System.out.println(IntStream.range(1, 10).distinct());
        System.out.println(IntStream.range(1, 10).findFirst());


    }

}
