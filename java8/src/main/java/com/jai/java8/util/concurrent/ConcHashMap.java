package com.jai.java8.util.concurrent;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcHashMap {

    public static void concHashMap() {
        Map map = new ConcurrentHashMap();

        map.putIfAbsent("0", "zero");
        map.putIfAbsent("1", "one");

        System.out.println("containsKey(1) : " + map.containsKey(1));
        System.out.println("containsKey('1') : " + map.containsKey("1"));
        System.out.println("Key 1 : " + map.get("1"));

        System.out.println("non existing key 2 : " + map.get("2"));
        System.out.println("containsKey('2') : " + map.containsKey("2"));
        System.out.println("Default : " + map.getOrDefault("2", "default for 2"));

        System.out.println("keySet : " + map.keySet());
        System.out.println("values : " + map.values());
        System.out.println("entrySet : " + map.entrySet());

        map.forEach((k, v) -> {
            System.out.println("key : " + k + ", value : " + v);
        });

    }

    public static void main(String[] args) {
        ConcHashMap.concHashMap();
    }
}
