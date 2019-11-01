package com.jai.java8.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sort {

	List<String> names = Arrays.asList("Ram", "Sita", "Geeta", "Ramya", "Jay", "Sankar", "Aishwarya", "Zenifer", "Wimpey", "Xavier");

	private void classicSort() {
		System.out.println(names);
		names.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		System.out.println(names);

	}

	private void lambdaSort() {
		System.out.println("Before 	: " + names);
        names.sort(Comparator.naturalOrder());
		System.out.println("Ascending sort 	: " + names);
        names.sort(Comparator.reverseOrder());
        System.out.println("Descending sort : " + names);

	}

	public static void main(String[] args) {

		Sort sort = new Sort();
		sort.classicSort();
		sort.lambdaSort();
	}

}
