package com.Demo.OOPS;

import java.io.FileNotFoundException;
import java.io.IOException;

public class InheritanceChild extends InheritanceParent{

	String child;
	//public int id;
	static {
		System.out.println("Hi Prachi");
	}
	public InheritanceChild(){
		
	}
	InheritanceChild(int id){
		this.id=id;
	}
	void childMethod() {
		System.out.println("inside childMethod");
	}
	
	public static void parentM1()  throws FileNotFoundException{
		System.out.println("inside static child parentM1");
	}
	public void parentM2() {
		System.out.println("inside non static child parentM2");
	}
	
	public static void main(String args[]) throws IOException  {
		
		InheritanceChild c=new InheritanceChild();
		c.childMethod();
		c.parentMethod();
		System.out.println(c.parent);
		System.out.println(c.child); 
		System.out.println("--1----------------------------------------");
		InheritanceParent p=new InheritanceParent();
		p.parentMethod();
		
		System.out.println("--2----------------------------------------");
		InheritanceParent p1=new InheritanceChild();
		p1.parentM2();
		p1.parentM2();
		InheritanceParent.parentM1();
		InheritanceChild.parentM1();
		
		System.out.println("--3----------------------------------------");
		int a=0x000F;
		int b=0x2222;
		System.out.println(a&b);
		boolean b1=true;
		boolean b2=false;
		boolean b3=true;
		if(b1&b2 | b2&b3 | b2)
			System.out.println("ok");
		if(b1&b2 | b2&b3 | b2 | b1)
			System.out.println("KO");
		int a1=1;
		methodTest(a1);
		System.out.println(a1);
		if(b2=true)
			System.out.println("false");
		else
			System.out.println("true");
		
		System.out.println("---4---------------------------------------");
		
		InheritanceChild in=new InheritanceChild(10);
		System.out.println(in.id);
		
	}

	private static void methodTest(int a1) {
		// TODO Auto-generated method stub
		a1=100;
	}
	
}
