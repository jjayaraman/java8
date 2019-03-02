package com.jai.java8.stream;

import java.util.ArrayList;
import java.util.List;

import com.jai.java8.model.Employee;

public class HelloStream {

	List<Employee> names = new ArrayList<Employee>();

	public HelloStream() {
		names.add(new Employee("JJay", 23));
		names.add(new Employee("Trisha", 33));
		names.add(new Employee("Rama", 44));
		names.add(new Employee("Xavier", 13));
		names.add(new Employee("Tabu", 32));
		names.add(new Employee("Tabu", 32));

	}

	public void hello() {
		names.stream().distinct().forEach(e -> System.out.println(e));
		System.out.println("");
		names.stream().forEach(e -> System.out.println(e));

		System.out.println(names.stream().findFirst());
		System.out.println("");

		names.stream().filter(e -> e.getAge() <= 23).forEach(e -> System.out.println(e));
		System.out.println("");

	}

	public static void main(String[] args) {
		HelloStream helloStream = new HelloStream();
		helloStream.hello();
	}

}
