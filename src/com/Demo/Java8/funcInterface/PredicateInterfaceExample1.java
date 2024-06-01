package com.Demo.Java8.funcInterface;

import java.util.function.Predicate;

public class PredicateInterfaceExample1 {
	public static void main(String[] args) {
		Predicate<Integer> pr = age -> {
			return age > 18;
		}; // Creating predicate
		System.out.println(pr.test(18)); // Calling Predicate method

		Predicate<String> sPredicate = password -> {
			return password.length() >= 4 && password.length() <= 8;
		};
	}
}

class TestAge implements Predicate<Integer> {
	@Override
	public boolean test(Integer age) {
		return age > 18;
	}

}

class StringLength implements Predicate<String> {
	@Override
	public boolean test(String password) {
		return password.length() >= 4 && password.length() <= 8;
	}

}