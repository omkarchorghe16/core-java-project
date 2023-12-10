package com.Demo.Java8;

public class DemoClass implements Interface1,Interface2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoClass d=new DemoClass();
		d.method();
		
		
		Interface2.method1();
		
		carryOutWork(() -> System.out.println(("Do work in lambda exp impl")));
		
	}
	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("inside main class");
		Interface1.super.method();
		Interface2.super.method();
	}
	

	public static void carryOutWork (FInterface sfi ) {
	sfi.method();
	}
	@Override
	public void methodAbs() {
		// TODO Auto-generated method stub
		
	}

	

}
