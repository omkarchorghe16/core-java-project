package com.Demo.DesignPattern;

import com.Demo.String.Address;

public class SingletonCustom {

	private static String PAN;
	private static String Name;
	private static Address A;
	
	private SingletonCustom(){
		
	}
	private static SingletonCustom singleton;
	//private static Singleton singleton=new Singleton("xyz", "akshay");
	
	/*
	 * Singleton(String pAN, String name) { PAN = pAN; Name = name; }
	 */
	
	public static SingletonCustom getInstance() {
		if(singleton==null) {
			singleton=new  SingletonCustom();
		}
		return singleton;
		
	}
	
	 private static final SingletonCustom EarlyINSTANCE = new SingletonCustom();
	 
	 public static SingletonCustom getEarlyInstance() {
	        return EarlyINSTANCE;
	 }
	    
	public static void main(String args[]) {
		
		SingletonCustom s=singleton.getInstance();
		System.out.println(s.hashCode());
		SingletonCustom s1=singleton.getInstance();
		System.out.println(s1.hashCode());
		
		//outside this class we cannot call contructor bcoz it is private
		SingletonCustom s3=new SingletonCustom();
		System.out.println(s3.hashCode());
		SingletonCustom s4=new SingletonCustom();
		System.out.println(s4.hashCode());
		
		
		
	   

	}
	
}
