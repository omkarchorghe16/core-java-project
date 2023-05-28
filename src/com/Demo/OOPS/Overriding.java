package com.Demo.OOPS;

public class Overriding extends OverridingParent{

	protected int add(int a,int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriding o=new Overriding();
		
		System.out.println(o.add(10, 20));
	}

}
