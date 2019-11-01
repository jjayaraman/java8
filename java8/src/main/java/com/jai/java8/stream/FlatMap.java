package com.jai.java8.stream;

import java.util.*;
import java.util.stream.Collectors;

public class FlatMap {


    public static void main(String[] args) {


        Map<String, List<String>> people = new HashMap<>();
        people.put("John", Arrays.asList("555-1123", "555-3389"));
        people.put("Mary", Arrays.asList("555-2243", "555-5264"));
        people.put("Steve", Arrays.asList("555-6654", "555-3242"));


        System.out.println(people.values().stream().collect(Collectors.toList()));
        System.out.println(people.values().stream().flatMap(Collection::stream).collect(Collectors.toList()));
    }
}
