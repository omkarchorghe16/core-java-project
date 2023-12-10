package com.Demo.Java8.streams;
import java.util.ArrayList;
import java.util.List;

public class ParallelStreamDemo3 {
	public static void main(String[] args) {
		long t1, t2;
		List<Employee> empList = new ArrayList<Employee>();
		for(int i=0; i<100; i++) {
			empList.add(new Employee(1, "Onkar", "Trainer", 50000,10));
			empList.add(new Employee(2, "Amit", "Admin", 30000,20));
			empList.add(new Employee(3, "Rahul", "HR", 40000,30));
			empList.add(new Employee(4, "Ajay", "Trainer", 55000,10));
			empList.add(new Employee(5, "Kiran", "Admin", 35000,20));
			empList.add(new Employee(6, "Kumar", "HR", 40500,30));
			empList.add(new Employee(7, "Ajit", "CEO", 500000,100));
			empList.add(new Employee(8, "Laxman", "Trainer", 350000,10));
		}
		System.out.println("empList size="+empList.size());

		t1 = System.currentTimeMillis();   
		System.out.println("Sequential Stream Count: " + 
				empList.stream().filter(e -> e.getSalary() > 15000).count());

		t2 = System.currentTimeMillis();
		System.out.println("Sequential Stream Time Taken: " + (t2-t1) + "\n");


		t1 = System.currentTimeMillis();        
		System.out.println("Parallel Stream Count: " + 
		empList.parallelStream().filter(e -> e.getSalary() > 15000).count());

		t2 = System.currentTimeMillis();
		System.out.println("Parallel Stream Time Taken: " + (t2-t1));
	}

}
