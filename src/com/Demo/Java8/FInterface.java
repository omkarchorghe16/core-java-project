package com.Demo.Java8;

@FunctionalInterface
public interface FInterface {

	 //void method(); //if we not specified abstract bydefault it concidered as abstract
	 abstract void method(); //one method should be default abstract
	
	 //more than 1 abstract method is not allowed in functional interface
	 //abstract void method12();
	 
	 //other multiple methods can be default/static
	public static void method1() {
		System.out.println("inside method1");
	}
	
	public default void method3() {
		System.out.println("indside method3");
	}
	
	 //can't have obj method inside java interface
	/*
	 boolean equals(Object obj) {
	 	 return true;
	 }
	 */
	
}
