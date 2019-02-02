package com.jai.java8.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
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
		names.sort((a, b) -> a.compareTo(b));
		System.out.println("Ascending sort 	: " + names);
		names.sort((a, b) -> b.compareTo(a));
		System.out.println("Desecending sort : " + names);

	}

	public static void main(String[] args) {

		Sort sort = new Sort();
		sort.classicSort();
		sort.lambdaSort();
	}

}

class Employee {

	String name;
	String city;
	String postCode;
	int age;
	Date dateOfBirth;

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

}