package com.Demo.Java8.funcInterface;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterfaceExample4{ 
	public static void main(String[] args) 
	{ 
		// Creating predicate 
		Predicate<Integer> lesserthan = i -> (i < 18);  
	
		// Calling Predicate method 
		System.out.println(lesserthan.test(10));

		Predicate<Integer> greaterThanTen = (i) -> i > 10; 
		Predicate<Integer> lowerThanTwenty = (i) -> i < 20;  
		boolean result = greaterThanTen.and(lowerThanTwenty).test(15); 
		System.out.println(result); 

		Predicate<String> hasLengthOf10 = str ->  str.length() > 10; 
		Predicate<String> containsA = p -> p.contains("A");
		String stringToTest = "And"; 
		result = hasLengthOf10.or(containsA).test(stringToTest); 
		System.out.println(result); 

		String aString = "Thunderstruck is a 2012 children's film starring Kevin Durant"; 
		result = hasLengthOf10.negate().test(aString); 
		System.out.println(result);
		
		List<Integer> numbers = Arrays.asList(12,34,23,56,34,58,78);
		Predicate<List> checkNumber = (list) -> list.contains(10);
		result = checkNumber.test(numbers);
		System.out.println(result);
	} 
} 





