package com.Demo.OOPS;

import java.io.FileNotFoundException;
import java.io.IOException;

public class InheritanceParent {

	int parent;
	public int id=1;
	
	 protected static String name = "Sue";
	 
	void parentMethod() {
		System.out.println("inside parentMethod");
	}
	
	public static void parentM1() throws FileNotFoundException{
		System.out.println("inside static parent parentM1");
	}
	protected void parentM2() {
		System.out.println("inside non static parent parentM2");
	}
}
