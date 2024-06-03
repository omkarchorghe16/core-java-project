package com.Demo.OOPS;

public class VariableAccessScope {

	int a=10;
	
	public VariableAccessScope(){
		
	}
	public static void main(String[] args) {
		int a=20;
		System.out.println("a="+a);
		VariableAccessScope v=new VariableAccessScope();
		v.method1();
	}
	private void method1() {
		System.out.println(this.a);
		System.out.println(a);
	}

	
}
