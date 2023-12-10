package com.Demo.Java8.funcInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeCompare {
	public static void main(String[] args) {
		Employee employee1 = new Employee(101, "Ram", "Developer");
		Employee employee2 = new Employee(108, "Sham", " Sr. Developer");
		Employee employee3 = new Employee(104, "Seeta", "Tester");
		Employee employee4 = new Employee(102, "Geeta", "HR");
		Employee employee5 = new Employee(109, "Anita", "Admin");
		
		List<Employee> employees = new ArrayList<>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		System.out.println("********************************");
		//Collections.sort(employees, new EmployeeIdComparator());
		Employee employee = new Employee();
		Collections.sort(employees, employee::compareById);
		for (Employee emp : employees) {
			System.out.println(emp);
		}
		
		Collections.sort(employees, Employee::compareByName);
		for (Employee emp : employees) {
			System.out.println(emp);
		}
	}
}
