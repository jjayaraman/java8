package com.jai.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ComparableSort {

	List<Employee> employees = new ArrayList<Employee>();

	public ComparableSort() {
		employees.add(new Employee("Jay", 23));
		employees.add(new Employee("Aisu", 3));
		employees.add(new Employee("Zeebra", 123));
		employees.add(new Employee("Xavier", 30));
		employees.add(new Employee("Cinderla", 16));
	}

	private void sort1() {

		Collections.sort(employees);
		employees.forEach(e -> System.out.println(((Employee) e).age));
	}

	private void lambdaSort() {
		employees.sort((e1, e2) -> e1.age - e2.age);
		employees.forEach(e -> System.out.println(e.age));

		employees.sort((e1, e2) -> e2.age - e1.age);
		employees.forEach(e -> System.out.println(e.age));

		employees.sort((e1, e2) -> e1.name.compareTo(e2.name));
		employees.forEach(e -> System.out.println(e.name));

		employees.sort((e1, e2) -> e2.name.compareTo(e1.name));
		employees.forEach(e -> System.out.println(e.name));
	}

	public static void main(String[] args) {

		ComparableSort sort = new ComparableSort();
		// sort.sort1();
		sort.lambdaSort();
	}

}

// class Employee implements Comparator<Employee> {
class Employee implements Comparable<Employee> { // Natural ordering

	String name;
	String city;
	String postCode;
	int age;
	Date dateOfBirth;

	/**
	 * @param name
	 * @param age
	 */
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	/**
	 * @param name
	 * @param city
	 * @param postCode
	 * @param age
	 * @param dateOfBirth
	 */
	public Employee(String name, String city, String postCode, int age, Date dateOfBirth) {
		super();
		this.name = name;
		this.city = city;
		this.postCode = postCode;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + ", postCode=" + postCode + ", age=" + age + ", dateOfBirth=" + dateOfBirth + "]";
	}

	// When implementing Comparable
	@Override
	public int compareTo(Employee o) {
		return this.age - o.age; // ascending
		// return o.age - this.age; // descending
	}

}
