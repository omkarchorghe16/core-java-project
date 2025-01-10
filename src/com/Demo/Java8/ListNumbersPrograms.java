package com.Demo.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ListNumbersPrograms {

	public static void main(String[] args) {
		List<Integer> lnums = new ArrayList();
		lnums = Arrays.asList(2, 15, 6, 9, 16);

		List<Integer> lnumbers = new ArrayList();
		Integer arr[] = { 11, 2, 13, 4, 5, 16, 7, 8, 91, 10, 2, 10, 10 };
		lnumbers = Arrays.asList(arr);

		Collections.sort(lnums, (s1, s2) -> s1.compareTo(s2));
		System.out.println("Sorted array lnums = " + lnums);

		System.out.println("Sort using Java 8 syntax ASC ");
		List<Integer> sortedList = lnumbers.stream().sorted().collect(Collectors.toList());
		System.out.println("sortedList array lnumbers ASC = " + sortedList);
		// sortedList.forEach(System.out::print);

		System.out.println("-------------------------------------------------");
		System.out.println("finding duplicate using Java 8 ");
		Set<Integer> set = new HashSet<Integer>();
		// This is printing duplicate elements multiple time
		// lnumbers.stream().filter(x->!set.add(x)).forEach(x->System.out.println(x));
		lnumbers.stream().filter(x -> !set.add(x)).collect(Collectors.toSet()).forEach(x -> System.out.println(x));

		System.out.println("-------------------------------------------------");
		System.out.println("Sort using Java 8 syntax DESC ");
		List<Integer> sortedListRev = lnums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("sortedList array lnums DESC = " + sortedListRev);
		// sortedListRev.forEach(System.out::println);
		System.out.println("-------------------------------------------------");

		System.out.println("Sort Employee list using Java 8 ASC");
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(10, "Ramesh", 30, 400000));
		employees.add(new Employee(20, "John", 29, 350000));
		employees.add(new Employee(30, "Tom", 30, 450000));
		employees.add(new Employee(40, "Pramod", 29, 500000));

		List<Employee> employeesSortedList1 = employees.stream()
				.sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())).collect(Collectors.toList());
		System.out.println(employeesSortedList1);

		List<Employee> employeesSortedList2 = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary))
				.collect(Collectors.toList()); // ascending order
		System.out.println(employeesSortedList2);
		
		System.out.println("Sort Employee list using Java 8 DESC");
		
		List<Employee> employeesSortedList3 = employees.stream()
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList()); // ascending
																													// order
		System.out.println(employeesSortedList3);

		System.out.println("-------------------------------------------------");
		System.out.println("finding duplicate count of words in string using Java 8 ");
		String str = "my name is omkar my fullname is omkar rajaram chorghe";
		List<String> stmt = Arrays.asList(str.split(" "));
		Map<String, Long> countMap = stmt.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(countMap);
		System.out.println("-------------------------------------------------");

		System.out.println("finding sqr root of 1 to 10 prime numbers using Java 8 ");

		List<Double> sqroot = Stream.iterate(1, i -> i + 1).filter(ListNumbersPrograms::isprime).map(Math::sqrt)
				.limit(10).collect(Collectors.toList());
		System.out.println(sqroot);

	}

	// Java 8 prime number code
	private static boolean isprime(Integer number) {
		return number > 1 && IntStream.range(2, number).noneMatch(n -> number % n == 0);
	}

	// Legacy prime number code
	private static boolean isprimeOld(Integer number) {
		boolean isDivisible = false;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isDivisible = true;
				return true;

			} else {
				return false;
			}
		}
		return number > 1 && !isDivisible;
	}
}
