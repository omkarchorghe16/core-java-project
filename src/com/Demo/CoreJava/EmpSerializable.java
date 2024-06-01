package com.Demo.CoreJava;

import java.io.Serializable;

//Java code for serialization and deserialization of a Java object 
public class EmpSerializable implements Serializable {
	
	private static final long serialversionUID = 129348938L;
	
	transient int a;
	static int b;
	String name;
	int age;

// Default constructor 
	public EmpSerializable(String name, int age, int a, int b) {
		this.name = name;
		this.age = age;
		this.a = a;
		this.b = b;
	}

}
