package com.Demo.Constructor;

public class EmployeeConstructor extends SuperConstructor {

	int id, age;
	String name, address;
	float salary;

	EmployeeConstructor() {
		super();
	}

	// need to invoke super() constructor
	EmployeeConstructor(int age) {
		// this();
		this.age = age;
	}

	EmployeeConstructor(int id, int age) {
		this(age);
		this.id = id;
	}

	EmployeeConstructor(int id, int age, String name, String address) {
		this(id, age);
		this.name = name;
		this.address = address;
	}

	EmployeeConstructor(int id, int age, String name, String address, float salary) {
		super(age, name, address);
		this.salary = salary;
	}

	public static void main(String[] args) {
		System.out.println("inside EmployeeConstructor");
		EmployeeConstructor s = new EmployeeConstructor();
		System.out.println(s);

	}

	@Override
	public String toString() {
		return "EmployeeConstructor [id=" + id + ", age=" + age + ", name=" + name + ", address=" + address
				+ ", salary=" + salary + "]";
	}

}
