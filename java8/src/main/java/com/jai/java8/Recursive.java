package com.jai.java8;

public class Recursive {


    static void print(int i) {
        if (i >= 1) {
            print(i - 1);
//            print(i--);
//            print(--i);
        }
        System.out.println("out :: " + i);
    }

    public static void main(String[] args) {
        print(5);
    }
}
