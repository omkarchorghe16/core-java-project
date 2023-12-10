package com.Demo.Java8.streams;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class StreamBuilders {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++) {
			list.add(i);
		}
		Stream<Integer> stream = list.stream();
		stream.forEach(p -> System.out.println(p));

		System.out.println("********************");

		// generate infinite times
		Stream<Date> streamd = Stream.generate(() -> {
			return new Date();
		});
		// streamd.forEach(p -> System.out.println(p));

		System.out.println("********************");

		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Ajit");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");

		// Print names of the members whose names are starting with 'A'
		memberNames.stream().filter((s) -> s.startsWith("A")).forEach(System.out::println);
		System.out.println("********************");

		memberNames.stream().filter((s) -> s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);

		System.out.println("********************");

		// Sort all member names and print in uppercase
		memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);

		System.out.println("********************");

	}

}
