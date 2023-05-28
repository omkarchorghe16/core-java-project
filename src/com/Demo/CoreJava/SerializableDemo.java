package com.Demo.CoreJava;
//Java code for serialization and deserialization  
//of a Java object
public class SerializableDemo implements java.io.Serializable 
{ 
	private static final long serialVersionUID = 1234567L; 
	
    public int a; 
    public String b; 
  
    // Default constructor 
    public SerializableDemo(int a, String b) 
    { 
        this.a = a; 
        this.b = b; 
    } 
  
} 
