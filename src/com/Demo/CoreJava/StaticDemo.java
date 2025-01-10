package com.Demo.CoreJava;

public class StaticDemo {

	static int a = 10;

	StaticDemo() {
		System.out.println("Inside constructor");
	}

	static {
		System.out.println("Inside static block " + a);
	}

	public static void main(String[] args) {
		a = 20;
		StaticDemo s1 = new StaticDemo();

		StaticDemo s2 = new StaticDemo();

		Integer b = 10;
		s1.incrementValue(b);
		System.out.println(b);
	}

	public Integer incrementValue(Integer b) {
		b = b + 5;
		return b;
	}
}
