package com.Demo.ExceptionHandling;

public class CustomException {

	
	public static void main(String[] args) {
		CustomException c = new CustomException();
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		try {
			c.printArray(arr);
		} catch (ArrayLengthMaxException e) {
			System.out.println("CustomException 1= " + e.getMessage());
		}

	}

	public void printArray(int[] array) throws ArrayLengthMaxException {
		try {
			for (int i = 0; i <= array.length; i++) {
				System.out.println("elements = " + array[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
			 System.out.println("CustomException 2= " + e.getMessage());
			throw new ArrayLengthMaxException("Array length should not be greater than 10");
		}
	}

}

class ArrayLengthMaxException extends Exception {
	
	// public String errorMessage;
	public ArrayLengthMaxException(String errorMessage) {
		super(errorMessage);
	}

}