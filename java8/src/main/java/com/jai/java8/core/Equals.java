package com.jai.java8.core;

public class Equals {

    public static void main(String[] args) {
        Employee e1 = new Employee("jay", "it");
        Employee e2 = new Employee("jay", "it");
        Employee e3 = e2;

        System.out.println(e1.equals(e2));
        System.out.println(e2.equals(e3));
        System.out.println(e3.equals(e1));

        System.out.println(e1 == e2);
        System.out.println(e2 == e3);
        System.out.println(e3 == e1);


        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        System.out.println(e3.hashCode());

    }
}

class Employee {

    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

//    @Override
//    public boolean equals(Object other) {
//        if(this == other) {
//            return true;
//        }
//        if(!(other instanceof  Employee)) {
//            return false;
//        }
//        Employee otherEmployee = (Employee)other;
//        if(name.equals(otherEmployee.name) && department.equals(otherEmployee.department)) {
//            return true;
//        }
//        return false;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (!name.equals(employee.name)) return false;
        return department.equals(employee.department);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name, department);
//    }
//    @Override
//    public int hashCode() {
//
//        int result = 31;
//        result = result * name.hashCode();
//        result = result * department.hashCode();
//        return  result;
//    }

}
