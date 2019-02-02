package com.jai.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class ComparatorSort {

	List<Employee2> employees = new ArrayList<Employee2>();

	public ComparatorSort() {
		employees.add(new Employee2("Jay", 23));
		employees.add(new Employee2("Aisu", 3));
		employees.add(new Employee2("Zeebra", 123));
		employees.add(new Employee2("Xavier", 30));
		employees.add(new Employee2("Cinderla", 16));
	}

	private void sortByAge() {

		Collections.sort(employees, new EmployeeAgeComparator());
		employees.forEach(e -> System.out.println(((Employee2) e).age));

		Collections.sort(employees, new EmployeeAgeComparatorDesc());
		employees.forEach(e -> System.out.println(((Employee2) e).age));
	}

	private void sortByName() {
		Collections.sort(employees, new EmployeeNameComparator());
		employees.forEach(e -> System.out.println(e.name));

		Collections.sort(employees, new EmployeeNameComparatorDesc());
		employees.forEach(e -> System.out.println(e.name));
	}

	private void lambdaSort() {

		Comparator<Employee> ageComparator = Comparator.comparing(Employee::getAge);
	}

	public static void main(String[] args) {

		ComparatorSort sort = new ComparatorSort();
		sort.sortByAge();
		sort.sortByName();
	}

}

class Employee2 {

	String name;
	String city;
	String postCode;
	int age;
	Date dateOfBirth;

	/**
	 * @param name
	 * @param age
	 */
	public Employee2(String name, int age) {
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
	public Employee2(String name, String city, String postCode, int age, Date dateOfBirth) {
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

class EmployeeAgeComparator implements Comparator<Employee2> {

	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		return o1.age - o2.age;
	}
}

class EmployeeAgeComparatorDesc implements Comparator<Employee2> {

	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		return o2.age - o1.age;
	}
}

class EmployeeNameComparator implements Comparator<Employee2> {

	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		return o1.name.compareTo(o2.name);
	}
}

class EmployeeNameComparatorDesc implements Comparator<Employee2> {

	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		return o2.name.compareTo(o1.name);
	}
}