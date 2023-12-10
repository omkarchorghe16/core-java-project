package com.Demo.Java8.streams;

import java.util.ArrayList;

public class StreamsBuilder {

	public static void main(String[] args) {
		ArrayList<Employee> empList= new ArrayList<Employee>();
		empList.add(new Employee(1, "Onkar", "Trainer", 50000,10));
		empList.add(new Employee(2, "Amit", "Admin", 30000,20));
		empList.add(new Employee(3, "Rahul", "HR", 40000,30));
		empList.add(new Employee(4, "Ajay", "Trainer", 55000,10));
		empList.add(new Employee(5, "Kiran", "Admin", 35000,20));
		empList.add(new Employee(6, "Kumar", "HR", 40500,30));
		empList.add(new Employee(7, "Ajit", "CEO", 500000,100));
		empList.add(new Employee(8, "Laxman", "Trainer", 350000,10));
		
		
		/*
		 * Print information of all the employees whose salary is greater than 20000 and are
		 * from deptno 10.
		 * Employees must be sorted by empname
		 */
		
		empList.stream()
		//Filter by Salary
		.filter(e -> e.getSalary()>20000)
		//Nested Filter by Deptno
		.filter(e -> e.getDeptNo()==10)
		//Sort by Name
		.sorted(( e1,  e2) -> e1.getEname().compareTo(e2.getEname()))
      	.forEach(System.out::println);

	}

}
