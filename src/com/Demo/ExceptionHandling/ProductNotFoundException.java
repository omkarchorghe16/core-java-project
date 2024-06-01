package com.Demo.ExceptionHandling;

public class ProductNotFoundException extends Exception{

	public final static String errorMsg = "Product not found in database";
	public ProductNotFoundException(String errorMsg) {
		super(errorMsg);
	}

}
