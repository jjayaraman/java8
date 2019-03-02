package com.jai.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.jai.java8.model.Employee;

public class ComparatorSort {

	List<Employee> employees = new ArrayList<Employee>();

	public ComparatorSort() {
		employees.add(new Employee("Jay", 23));
		employees.add(new Employee("Aisu", 3));
		employees.add(new Employee("Zeebra", 123));
		employees.add(new Employee("Xavier", 30));
		employees.add(new Employee("Cinderla", 16));
	}

	private void sortByAge() {

		Collections.sort(employees, new EmployeeAgeComparator());
		employees.forEach(e -> System.out.println(((Employee) e).getAge()));

		Collections.sort(employees, new EmployeeAgeComparatorDesc());
		employees.forEach(e -> System.out.println(((Employee) e).getAge()));
	}

	private void sortByName() {
		Collections.sort(employees, new EmployeeNameComparator());
		employees.forEach(e -> System.out.println(e.getName()));

		Collections.sort(employees, new EmployeeNameComparatorDesc());
		employees.forEach(e -> System.out.println(e.getName()));
	}

	private void lambdaSort() {

		Comparator<Employee> ageComparator = Comparator.comparing(Employee::getAge);
		employees.forEach(e -> System.out.println(e.getAge()));
		Collections.sort(employees, ageComparator);
		employees.forEach(e -> System.out.println(e.getAge()));

		Comparator<Employee> nameComparator = Comparator.comparing(Employee::getName);
		Collections.sort(employees, nameComparator);
		employees.forEach(e -> System.out.println(e.getName()));
	}

	public static void main(String[] args) {

		ComparatorSort sort = new ComparatorSort();
		sort.sortByAge();
		sort.sortByName();
		sort.lambdaSort();
	}

}

class EmployeeAgeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getAge() - o2.getAge();
	}
}

class EmployeeAgeComparatorDesc implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.getAge() - o1.getAge();
	}
}

class EmployeeNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

class EmployeeNameComparatorDesc implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.getName().compareTo(o1.getName());
	}
}