package com.Demo.Java8.streams;

import java.util.Arrays;
import java.util.List;

//Java program to understand execution 
//of sequential streams
public class SequentialStreamDemo {

	  public static void main(String[] args) 
	    { 
	        // create a list 
	        List<String> list = Arrays.asList( "Hello ",  
	                          "G", "E", "E", "K", "S!"); 
	  
	        // we are using stream() method 
	          // for sequential stream 
	        // Iterate and print each element 
	          // of the stream 
	        list.stream().forEach(System.out::print); 
	    } 
	  
}
