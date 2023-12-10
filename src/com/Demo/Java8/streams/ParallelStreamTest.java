package com.Demo.Java8.streams;

public class ParallelStreamTest {
	public static void main(String[] args) {
		int num = Runtime.getRuntime().availableProcessors();
		System.out.println(num);
	}
}
