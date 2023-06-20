package com.Demo.DesignPattern;

import java.text.DateFormat;

public class Singleton{

	//Lazy initilization
	private static Singleton obj;
	
	//Eager initilization
	//private static Singleton obj = new Singleton();
	
	String str;
	private Singleton() {
		str = "it is an example of singleton class.";   
	}
	
	public static Singleton getInstance() {
		if(obj==null) 
			obj=new Singleton();
			
		return obj;
		
	}
	public static void main(String args[])
	{
		System.out.println("Hello Singleton");
		Singleton s=Singleton.getInstance();
		System.out.println(s.hashCode());
		
		Singleton s1=Singleton.getInstance();
		System.out.println(s1.hashCode());
		
		System.out.println(s +"-same instance-"+s1);
		
		System.out.println("Real Singleton classes--------------------------------");
		Runtime rt=Runtime.getRuntime();
		Runtime rt1=Runtime.getRuntime();  
		System.out.println(rt +"-same instance-"+rt1);
		
		DateFormat df=DateFormat.getInstance();
		DateFormat df1=DateFormat.getInstance();
		System.out.println(df +"-same instance-"+df1);
	}
}
