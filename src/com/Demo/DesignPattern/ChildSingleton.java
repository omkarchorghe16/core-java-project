package com.Demo.DesignPattern;

public class ChildSingleton extends ParentSingleton{

	 private static ChildSingleton instance;
	 //Make a constructor private.
	 private ChildSingleton(){
		 super();
	 }
	    public static synchronized ParentSingleton getInstance() {
	       if (instance == null) {
	          instance = new ChildSingleton();
	       }

	       return instance;
	    }    
	    
	public static void main(String[] args) {
		ParentSingleton p=ParentSingleton.getInstance();
		ParentSingleton c=ChildSingleton.getInstance();  
		System.out.println(p.hashCode() +"-not same instance-"+c.hashCode());

	}

}
