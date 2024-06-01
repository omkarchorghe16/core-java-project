package com.Demo.ExceptionHandling;

import java.util.ArrayList;
import java.util.List;

public class TryCatchFinally1 {

	public static void main(String[] args) {

		TryCatchFinally1 t = new TryCatchFinally1();
		Boolean res = t.getCorrectResult();
		System.out.println(res);

	}

	private Boolean getCorrectResult() {
		try {
			System.out.println("1");
			int a = 10 / 0;
			System.out.println("2");
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("3");
			// throw new ArithmeticException();
		} finally {
			System.out.println("5");
		}
		System.out.println("6");
		System.out.println("7");
		return true;
	}

}
