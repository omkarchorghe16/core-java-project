package com.Demo.Java8;

public class LymbdaExprDemo implements FInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FInterface fi=() -> System.out.println("inside override method");
		
		fi.method();
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("inside method");
	}

}
