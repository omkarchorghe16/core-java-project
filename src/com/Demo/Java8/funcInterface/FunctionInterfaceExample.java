package com.Demo.Java8.funcInterface;

import java.util.function.Function;

public class FunctionInterfaceExample {

	public FunctionInterfaceExample() {
	}

	public static void main(String[] args) {
		// Function which takes in a number
		// and returns half of it
		Function<Integer, Double> half = a -> a / 2.0;

		// Applying the function to get the result
		System.out.println(half.apply(10));

		System.out.println("-----------------------------------------------");
		// Now treble the output of half function
		half = half.andThen(a -> 3 * a);

		// Applying the function to get the result
		// and printing on console
		System.out.println(half.apply(10));
		System.out.println("-----------------------------------------------");
		// However treble the value given to half function
		half = half.compose(a -> 3 * a);

		// Applying the function to get the result
		System.out.println(half.apply(5));
		System.out.println("-----------------------------------------------");
		// Function which takes in a number and
		// returns it
		Function<Integer, Integer> i = Function.identity();

		// Print statement
		System.out.println(i.apply(10));
		System.out.println("-----------------------------------------------");
	}

}
