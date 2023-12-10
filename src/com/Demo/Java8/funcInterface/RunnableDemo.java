package com.Demo.Java8.funcInterface;

public class RunnableDemo {
	public static void main(String[] args) {
		
		Runnable runnable = () -> System.out.println("Inside run");
		
		Thread t = new Thread(runnable);
		t.start();
	}
}
