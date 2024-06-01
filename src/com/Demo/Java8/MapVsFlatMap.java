package com.Demo.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapVsFlatMap {

	public static void main(String[] args) {

		//find length of each word
		List<String> list=Arrays.asList("omkar chorghe","swapnil","amol","Akshay","niraj");
		List<Integer> wordLength=list.stream().map(String::length).collect(Collectors.toList());
		System.out.println("wordLength ="+wordLength);
		System.out.println("-------------------------------------------------");
		mapDemo();
		flatMapDemo();
	}
	// Java program using map() function
	 public static void mapDemo()
	    {
	        // making the array list object
	        ArrayList<String> fruit = new ArrayList<>();
	        fruit.add("Apple");
	        fruit.add("mango");
	        fruit.add("pineapple");
	        fruit.add("kiwi");
	        System.out.println("List of fruit-" + fruit);
	       
	        // lets use map() to convert list of fruit
	        List list = fruit.stream()
	                        .map(s -> s.length())
	                        .collect(Collectors.toList());
	        System.out.println("List generated by map-" + list);
	    }
	 
	// Java program using flatMap() function
	 public static void flatMapDemo()
	    {
	        // making the arraylist object of List of Integer
	        List<List<Integer> > number = new ArrayList<>();
	       
	        // adding the elements to number arraylist
	        number.add(Arrays.asList(1, 2));
	        number.add(Arrays.asList(3, 4));
	        number.add(Arrays.asList(5, 6));
	        number.add(Arrays.asList(7, 8));
	       
	        System.out.println("List of list-" + number);
	       
	        // using flatmap() to flatten this list
	        List<Integer> flatList
	            = number.stream()
	                  .flatMap(list -> list.stream())
	                  .collect(Collectors.toList());
	       
	        // printing the list
	        System.out.println("List generate by flatMap-"
	                           + flatList);
	    }
}
