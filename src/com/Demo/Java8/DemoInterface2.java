package com.Demo.Java8;

//Normal interface without @FunctionalInterface allowed 2+ abstract methods
//@FunctionalInterface allows only 1 abstract method
//@FunctionalInterface
public interface DemoInterface2 {

	//Normal interface can have 2 abstract methods
	abstract void methodAbs();

	abstract void methodAbs2();

	default void method() {
		System.out.println("inside interface2 default method");
	}

	default void method2() {
		System.out.println("inside interface2 default method2");
	}

	static void method1() {
		System.out.println("inside interface2 static method1");
	}

}
