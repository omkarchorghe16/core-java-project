package com.Demo.Java8.funcInterface;
import java.util.function.Consumer;

public class ConsumerInterfaceExample1 {
	static void printMessage(String name) {
		System.out.println("Hello " + name);
	}

	static void printValue(int val) {
		System.out.println(val);
	}

	public static void main(String[] args) {
		// Referring method to String type Consumer interface
		Consumer<String> consumer1 = ConsumerInterfaceExample1::printMessage;
		consumer1.accept("John"); // Calling Consumer method

		// Referring method to Integer type Consumer interface
		Consumer<Integer> consumer2 = ConsumerInterfaceExample1::printValue;
		consumer2.accept(12); // Calling Consumer method

		Consumer<String> consumer3 = name -> System.out.println("Hello " + name);
		consumer3.accept("Smith");

		Consumer<Integer> consumer4 = value -> System.out.println("Square of " + value + " is " + value * value);
		consumer4.accept(12);

	}
}