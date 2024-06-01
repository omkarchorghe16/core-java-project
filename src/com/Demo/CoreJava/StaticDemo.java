package com.Demo.CoreJava;

public class StaticDemo {

	static int a=10;
	StaticDemo(){
		System.out.println("Inside constructor");
	}
	static {
		System.out.println("Inside static block "+a);
	}
	public static void main(String[] args) {
		a=20;
		StaticDemo s1=new StaticDemo();
		
		StaticDemo s2=new StaticDemo();
	}

}
