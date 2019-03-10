package com.jai.java8.stream;

import java.util.stream.LongStream;

public class LongStr {

    public static void main(String[] args) {
        System.out.println(LongStream.of(1l, 2l, 3l, 4, 5).count());

    }
}
