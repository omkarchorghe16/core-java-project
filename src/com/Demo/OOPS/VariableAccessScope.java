package com.Demo.OOPS;

public class VariableAccessScope {

	int a=10;
	
	public VariableAccessScope(){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		System.out.println(a);
		VariableAccessScope v=new VariableAccessScope();
		v.method1();
	}
	private void method1() {
		// TODO Auto-generated method stub
		System.out.println(this.a);
	}

	
}
