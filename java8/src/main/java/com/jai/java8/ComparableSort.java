package com.jai.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.jai.java8.model.Employee;

public class ComparableSort {

	List<Employee2> employees = new ArrayList<Employee2>();

	public ComparableSort() {
		employees.add(new Employee2("Jay", 23));
		employees.add(new Employee2("Aisu", 3));
		employees.add(new Employee2("Zeebra", 123));
		employees.add(new Employee2("Xavier", 30));
		employees.add(new Employee2("Cinderla", 16));
	}

	private void sort1() {
		Collections.sort(employees);
		employees.forEach(e -> System.out.println(((Employee2) e).getAge()));
	}

	private void lambdaSort() {
		employees.sort((e1, e2) -> e1.getAge() - e2.getAge());
		employees.forEach(e -> System.out.println(e.getAge()));

		employees.sort((e1, e2) -> e2.getAge() - e1.getAge());
		employees.forEach(e -> System.out.println(e.getAge()));

		employees.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));
		employees.forEach(e -> System.out.println(e.getName()));

		employees.sort((e1, e2) -> e2.getName().compareTo(e1.getName()));
		employees.forEach(e -> System.out.println(e.getName()));
	}

	public static void main(String[] args) {

		ComparableSort sort = new ComparableSort();
		sort.sort1();
		sort.lambdaSort();
	}

}

class Employee2 extends Employee implements Comparable<Employee2> { // Natural ordering

	public Employee2(String name, int age) {
		super(name, age);
	}

	// When implementing Comparable
	@Override
	public int compareTo(Employee2 o) {
		return this.getAge() - o.getAge(); // ascending
		// return o.getAge() - this.getAge(); // descending
	}

}
