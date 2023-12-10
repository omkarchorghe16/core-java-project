package com.Demo.Java8.funcInterface;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceExample2 {
	public static void main(String args[]) {
		Consumer<Integer> consumer = i -> System.out.print(" " + i);
		List<Integer> integerList = Arrays.asList(1, 10, 100, 200, 101, -10, 0);
		printList(integerList, consumer);
	}

	public static void printList(List<Integer> listOfIntegers, Consumer<Integer> consumer) {
		for (Integer integer : listOfIntegers) {
			consumer.accept(integer);
		}
	}
}