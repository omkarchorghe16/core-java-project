package com.Demo.Java8.funcInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceExample1 {

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
		System.out.println("-------------------------------------------------------------- ");
		Consumer<Integer> consumer = i -> System.out.print(" " + i);
		List<Integer> integerList = Arrays.asList(1, 10, 100, 200, 101, -10, 0);
		printList(integerList, consumer);
		System.out.println("-------------------------------------------------------------- ");
		// Consumer<Integer> consumer= i-> System.out.print(" "+i);
		Consumer<Integer> consumerWithAndThen = consumer.andThen(i -> System.out.print("(squre is " + i * i + ")"));

		List<Integer> integerListSqr = Arrays.asList(1, 10, 100, 200, 8, 3, 2);
		printList(integerListSqr, consumerWithAndThen);
		System.out.println("-------------------------------------------------------------- ");

		Consumer<Integer> display = a -> System.out.println(a);
		display.accept(10);

		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(7);
		list.add(3);

		Consumer<List<Integer>> modify = aList -> {
			for (int i = 0; i < aList.size(); i++)
				aList.set(i, 2 * aList.get(i));
		};
		Consumer<List<Integer>> dispList = aList -> aList.stream().forEach(a -> System.out.print(a + " "));
		modify.andThen(dispList).accept(list);
	}

	static void printMessage(String name) {
		System.out.println("Hello " + name);
	}

	static void printValue(int val) {
		System.out.println(val);
	}

	public static void printList(List<Integer> listOfIntegers, Consumer<Integer> consumer) {
		for (Integer integer : listOfIntegers) {
			consumer.accept(integer);
		}
	}
}