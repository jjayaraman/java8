package com.jai.java8.lambda;

import java.util.Arrays;
import java.util.List;

public class Sort {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Ram", "Sita", "Geeta", "Ramya", "Jay", "Sankar");

		System.out.println("Before 	: " + names);

		names.sort((a, b) -> a.compareTo(b));

		System.out.println("After 	: " + names);

	}

}
