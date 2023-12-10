package com.Demo.Java8;

public interface Interface2{

	
	abstract void methodAbs();
	
	default void method() {
		 System.out.println("inside interface2 method");
	 }
	default void method2() {
		 System.out.println("inside interface2 method2");
	 }
	
	 static void method1() {
		 System.out.println("inside interface2 method1");
	 }
	 
}
