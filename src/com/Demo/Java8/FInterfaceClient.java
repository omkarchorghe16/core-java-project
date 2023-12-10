package com.Demo.Java8;

public class FInterfaceClient implements FInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		System.out.println("inside FInterfaceClient method");
	}

}
