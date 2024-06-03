package com.Demo.Program;

import java.util.Arrays;

public class ArrayPrograms {

	public static void main(String[] args) {
		ArrayPrograms p = new ArrayPrograms();

		int a[] = { 1, 2, 5, 7, 3, 2, 6 };
		int b[] = { 44, 66, 99, 77, 33, 22, 55 };
		// find largenst number in array
		System.out.println("Largest: " + getLargest(a, a.length));
		System.out.println("Largest: " + getLargestImplicitly(b, b.length));
		System.out.println("------------------------------------------------");

		// find duplicate number in array
		getDuplicateValues(a, a.length);
		System.out.println("------------------------------------------------");

		// reverse the given array
		getReversedArray(a, a.length);
		System.out.println("------------------------------------------------");

		// reverse the string
		getReversedString("my name is omkar");
		System.out.println("------------------------------------------------");

		// print 010101 in square eg. 5x5,6x6
		getZeroOneSqure(2);
		// 01
		// 10

		// swap 2 variable without temp variable
		swapTwoVariables(10, 2);
		System.out.println("------------------------------------------------");

		// search the number in array
		searchElementInArray(a, 1);
		System.out.println("------------------------------------------------");

		// display digit of integer
		displayDigitOfInteger(123);
		System.out.println("------------------------------------------------");

		// reverse of integer
		reverseNumber(12873);
		System.out.println("------------------------------------------------");

		// check string palindrome
		checkStringPalindrome("madam");
		System.out.println("------------------------------------------------");

		// \u000d
		// System.out.println("omkar chorghe");

	}

	private static void checkStringPalindrome(String string) {

		String reverse = "";
		for (int j = string.length() - 1; j >= 0; j--) {
			reverse = reverse + string.charAt(j);
		}
		if (string.equals(reverse))
			System.out.println("string is palindrome =" + reverse);
		else
			System.out.println("string is not palindrome =" + reverse);

	}

	private static void reverseNumber(int num) {
		String s = "" + num;
		int rev = 0;
		for (int i = 0; i < s.length(); i++) {
			int digit = num % 10;
			rev = (rev * 10) + digit;
			num = num / 10;

		}
		System.out.println("rev=" + rev);
		System.out.println("====================================");
		String reverse = "";
		for (int i = s.length()-1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);

		}
		System.out.println("reverse=" + reverse);
	}

	private static void displayDigitOfInteger(int num) {

		String s = "" + num;
		char arr[] = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			arr[i] = s.charAt(i);
			System.out.println("Digits are-" + arr[i]);
		}

	}

	private static void searchElementInArray(int[] a, int num) {
		int flag = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == num) {
				flag = 1;
			}
		}
		if (flag == 1)
			System.out.println("number found");
		else
			System.out.println("number not found");
	}

	private static void swapTwoVariables(int i, int j) {
		System.out.println("before swapping i=" + i + " & j=" + j);
		i = i + j;
		j = i - j;
		i = i - j;

		System.out.println("after swapping i=" + i + " & j=" + j);
	}

	private static void getZeroOneSqure(int count) {

		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				if ((j + i) % 2 == 0) {
					System.out.print("0");
				} else {
					System.out.print("1");
				}

			}
			System.out.println("");
		}
	}

	private static void getReversedString(String string) {
		String reverse = "";
		String arr[] = string.split(" ");
		for (int j = arr.length - 1; j >= 0; j--) {
			reverse = reverse + arr[j] + " ";
		}
		System.out.println("Reverse sentence is =" + reverse);

	}

	private static void getReversedArray(int[] a, int length) {
		int arr[] = new int[length];
		int counter = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}

		System.out.println("reversed array is =");
		for (int i = length - 1; i >= 0; i--) {
			arr[counter] = a[i];
			counter++;
			System.out.print(a[i] + ",");
		}

	}

	private static void getDuplicateValues(int[] a, int length) {
		int temp;
		for (int i = 0; i < length - 1; i++) {
			for (int j = i + 1; j < length; j++) {
				if (a[i] == a[j]) {
					System.out.println("duplicate number is=" + a[i]);
				}
			}
		}
	}

	public static int getLargestImplicitly(int[] a, int total) {
		Arrays.sort(a);
		return a[total - 1];
	}

	public static int getLargest(int[] a, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total - 1];
	}

}
