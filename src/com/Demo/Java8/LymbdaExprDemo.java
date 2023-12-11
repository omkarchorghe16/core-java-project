package com.Demo.Java8;

public class LymbdaExprDemo implements FInterface {

	public static void main(String[] args) {
		FInterface fi = () -> System.out.println("inside override method");

		fi.method();
	}

	@Override
	public void method() {
		System.out.println("inside method");
	}

}
