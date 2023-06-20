package com.Demo.DesignPattern;

public class ParentSingleton {

	 private static ParentSingleton instance;

	    protected ParentSingleton() {
	    }

	    public static synchronized ParentSingleton getInstance() {
	       if (instance == null) {
	          instance = new ParentSingleton();
	       }

	       return instance;
	    }

	          
}
