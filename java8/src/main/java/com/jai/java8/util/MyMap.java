package com.jai.java8.util;

import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.Map;

public class MyMap {



    public static void methods() {
        Map<String, String> users = new HashMap<>();
        users.put("jay", "it");

        users.computeIfAbsent("na", d -> "others");

        System.out.println(users.get("jay"));
        System.out.println(users.get("na"));
        System.out.println(users.get("aaa"));
    }


    public static void main(String[] args) {
        MyMap.methods();
    }
}
