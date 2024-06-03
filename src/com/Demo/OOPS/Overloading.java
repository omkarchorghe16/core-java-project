package com.Demo.OOPS;

public class Overloading {

	
	public static void main(String[] args) {

		System.out.println(InheritanceChild.name);
		
		method(10,20);
		method(10,20,10);
		//new Overloading().methodObj(null);
		new Overloading().methodObj(null);
		new Overloading().methodObj("");
	}

	private void methodObj(Object object) {
		System.out.println("inside Object="+object);
	}
	private void methodObj(String s) {
		System.out.println("inside String="+s);
	}
	/*
	private static  void methodObj(StringBuffer s) {
		System.out.println("inside StringBuffer="+s);
	}
	private static  void methodObj(StringBuilder s) {
		System.out.println("inside StringBuilder="+s);
	}
	*/
	private static void method(int i, int j) {
		System.out.println("inside int="+i+j);
	}
	private static void method(int i, long j) {
		System.out.println("inside long="+i+j);
	}
	private static void method(int i, Integer j) {
		System.out.println("inside Integer="+i+j);
	}
	
	private static void method(int i, int j,float f) {
		System.out.println("inside float="+i+j+f);
	}
}
