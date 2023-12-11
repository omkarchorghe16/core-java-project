package com.Demo.Java8;

//Normal interface
public interface DemoInterface1 {

	default void method() {
		System.out.println("inside interface1 default method");
	}

	// can't have obj method inside java interface
	/*
	 * boolean equals(Object obj) { return true; }
	 */

}
