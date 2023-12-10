package com.Demo.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class IteratorVSplitIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list=Arrays.asList("omkar","swapnil","amol","Akshay","niraj");
		Spliterator<String> s1=list.spliterator();
		Spliterator<String> s2=s1.trySplit();
		
		
		s1.forEachRemaining(System.out::println);
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&");
		s2.forEachRemaining(System.out::println);
		
	}

}
