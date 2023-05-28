package com.Demo.CoreJava;

public class StaticDemo {

	StaticDemo(){
		System.out.println("Inside constructor");
	}
	static {
		System.out.println("Inside static block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo s1=new StaticDemo();
		
		StaticDemo s2=new StaticDemo();
	}

}
