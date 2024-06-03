package com.Demo.OOPS;

import com.sun.media.jfxmedia.events.MarkerListener;

//abstract classes are fast
public abstract class AbstractDemo implements InterfaceDemo{

	//Instance variable allowed
	int instanceVar=0;
	
	//Constructor
	public AbstractDemo() throws ClassNotFoundException{
		System.out.println("inside constructor AbstractDemo");
	}
	
	public static void abstractMethod() {
		System.out.println("inside abstractMethod");
	}
	
	private void  nonAbstractMethod() {
		System.out.println("inside nonAbstractMethod");
	}
	
	public static void main(String[] args) {
		System.out.println("inside AbstractDemo");
		
		//AbstractDemo abs=new AbstractDemo(); //obj creation now allowed for abstract class
		abstractMethod();

		InterfaceDemo.interfaceDemoMethod();
		
		InterfaceDemo.interfaceDemoMethod2();
	}
	
	

}
