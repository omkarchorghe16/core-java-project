package com.Demo.Java8;

public interface Interface1 {

	default void method() {
		System.out.println("inside interface1 method");
	}

	// can't have obj method inside java interface
	/*
	 * boolean equals(Object obj) { 
	 * return true; 
	 * }
	 */

}
