package com.Demo.Java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamProgram {
	public static void main(String[] args) {
		//find sum of even numbers in list
		List<Integer> numbers = Arrays.asList(2,20,3,4,5, 6, 8, 10);
		
//		//2+4+6+8+10
//		List<Integer> evenNumbers = Arrays.asList(2, 4, 6, 8, 10);
//		int ans = 0;
//		for(int i : evenNumbers) {
//			ans = ans + i;
//		}
		int total = numbers.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
		System.out.println("total :"+total);
		
		System.out.println("-----------------------------------------------------------");
		
		//Sorting of list using java8
		Stream<Integer> sorted = numbers.stream().filter(x->x%2==0).sorted();
		System.out.println("sorted :"+sorted);
		sorted.forEach(System.out::println);
	}
}
