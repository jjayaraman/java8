package com.jai.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class ClassicSort {

	List<Employee> employees = new ArrayList<Employee>();

	public ClassicSort() {
		employees.add(new Employee("Jay", 23));
		employees.add(new Employee("Aisu", 3));
		employees.add(new Employee("Zeebra", 123));
		employees.add(new Employee("Xavier", 30));
		employees.add(new Employee("Cinderla", 16));
	}

	private void sort1() {
		// employees.stream().forEach(e -> System.out.println(e));
		employees.sort((a, b) -> a.age > b.age ? 1 : -1); // Sort age ascending
		employees.stream().forEach(e -> System.out.println(e.age));

		employees.sort((a, b) -> a.age < b.age ? 1 : -1); // Sort age descending
		employees.stream().forEach(e -> System.out.println(e.age));

	}

	public static void main(String[] args) {

		ClassicSort sort = new ClassicSort();
		sort.sort1();
		// sort.lambdaSort();
	}

}

class Employee {

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

}

class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.age == o2.age ? 1 : 0;
	}

}