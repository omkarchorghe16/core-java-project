package com.Demo.DesignPattern;

public class Singleton{

	private static Singleton obj;
	
	
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
	}
}
