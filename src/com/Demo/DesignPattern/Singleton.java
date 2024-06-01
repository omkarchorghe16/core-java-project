package com.Demo.DesignPattern;

import java.text.DateFormat;

//Example of singleton classes is Runtime class,DateFormat, Action Servlet, and Service Locator.
public class Singleton{

	//Lazy initilization
	private static Singleton obj;
	
	//Eager initilization
	//private static Singleton obj = new Singleton();
	
	private Singleton() {
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
		Singleton s1=Singleton.getInstance();
		
		System.out.println(s.hashCode() +"-same instance-"+s1.hashCode());
		
		System.out.println("Real Singleton classes--------------------------------");
		Runtime rt=Runtime.getRuntime();
		Runtime rt1=Runtime.getRuntime();  
		System.out.println(rt.hashCode() +"-same instance-"+rt1.hashCode());
		
		DateFormat df=DateFormat.getInstance();
		DateFormat df1=DateFormat.getInstance();
		System.out.println(df.hashCode() +"-same instance-"+df1.hashCode());
	}
}
