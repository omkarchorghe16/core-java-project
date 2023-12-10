package com.Demo.Java8.funcInterface;
import java.util.function.Supplier;

public class SupplierFunctionExample2 {
	public static void main(String[] args) {
		Supplier<Double> randomValue = () -> Math.random(); 
        System.out.println(randomValue.get()); 
	}
}
