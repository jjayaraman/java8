package com.jai.java8.model;

import java.util.Date;
import java.util.Objects;

public class Employee {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                Objects.equals(name, employee.name) &&
                Objects.equals(city, employee.city) &&
                Objects.equals(postCode, employee.postCode) &&
                Objects.equals(dateOfBirth, employee.dateOfBirth);
    }

	@Override
    public int hashCode() {
        return Objects.hash(name, city, postCode, age, dateOfBirth);
	}
}