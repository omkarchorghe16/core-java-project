package com.Demo.Java8.funcInterface;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierFunctionExample1 {
	public static void main(String args[]) {
		// Supplier instance with lambda expression
		Supplier<String> helloStrSupplier = () -> new String("Hello");
		String helloStr = helloStrSupplier.get();
		System.out.println("String in helloStr is->" + helloStr + "<-");

		// Supplier instance using method reference to default constructor
		Supplier<String> emptyStrSupplier = String::new;
		String emptyStr = emptyStrSupplier.get();
		System.out.println("String in emptyStr is->" + emptyStr + "<-");

		// Supplier instance using method reference to a static method
		Supplier<Date> dateSupplier = SupplierFunctionExample1::getSystemDate;
		Date systemDate = dateSupplier.get();
		System.out.println("systemDate->" + systemDate);
	}

	public static Date getSystemDate() {
		return new Date();
	}
}