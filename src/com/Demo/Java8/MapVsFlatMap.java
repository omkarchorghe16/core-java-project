package com.Demo.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapVsFlatMap {

	public static void main(String[] args) {

		//find length of each word
		List<String> list=Arrays.asList("omkar chorghe","swapnil","amol","Akshay","niraj");
		List<Integer> wordLength=list.stream().map(String::length).collect(Collectors.toList());
		System.out.println(wordLength);
		wordLength.forEach(System.out::print);
		
		
		
	}

}
