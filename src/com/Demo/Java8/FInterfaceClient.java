package com.Demo.Java8;

public class FInterfaceClient implements FInterface{

	public static void main(String[] args) {
		FInterfaceClient fi=new FInterfaceClient();
		//functional inteface method (need obj instance )
		fi.method();
		
		//Static method (no need obj instance)
		FInterface.method1();
		
		//default method (need obj instance)
		fi.method3();
		
	}

	@Override
	public void method() {
		System.out.println("inside FInterfaceClient method");
	}

}
