package com.jai.interview.baml;

import java.util.Arrays;
import java.util.stream.Stream;

public class Distinct {


    public static void main(String[] args) {

        String[] cities = {"a", "b", "a", "c", "c", "d", "e"};
        Stream<String> names = Arrays.stream(cities);
        System.out.println(names.distinct());

    }

}
