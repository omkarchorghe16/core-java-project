package com.Demo.Java8.funcInterface;
//Predicate Chaining through and method


import java.util.function.Predicate; 
public class PredicateInterfaceExample3 { 
	public static void main(String[] args) 
	{ 
		Predicate<Integer> greaterThanTen = (i) -> i > 10; 
		Predicate<Integer> lowerThanTwenty = (i) -> i < 20;  
		
		boolean result = greaterThanTen.and(lowerThanTwenty).test(15); 
		System.out.println(result); 

		boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15); 
		System.out.println(result2); 
		
		boolean result3 = greaterThanTen.or(lowerThanTwenty).test(25); 
		System.out.println(result3); 
	} 
} 