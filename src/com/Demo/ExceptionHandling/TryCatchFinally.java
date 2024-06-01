package com.Demo.ExceptionHandling;

public class TryCatchFinally {

	public static void main(String[] args) {
		TryCatchFinally tcf = new TryCatchFinally();

		int res = tcf.testDemoTryCatchFinally();
		System.out.println("Result - " + res);

		EmptyTryCatchDemo();

	}

	@SuppressWarnings("finally")
	private int testDemoTryCatchFinally() {
		try {
			System.out.println("inside try ");
			int i = 10 / 0;
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("inside catch");
			return 2;
		} finally {
			System.out.println("inside finally");
			return 3;
		}
		// System.out.println("outside finally"); //unreachable code

		// return 0;
	}

	private static void EmptyTryCatchDemo() {
		try {
			try {
				System.out.println("inside 2nd try");
			} finally {

			}
		} catch (Exception e) {
			System.out.println("inside catch");
		}
	}
}
