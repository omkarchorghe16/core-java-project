package com.Demo.OOPS;

import com.sun.media.jfxmedia.events.MarkerListener;

public abstract class AbstractDemo implements InterfaceDemo{

	int instanceVar=0;
	AbstractDemo() throws ClassNotFoundException{
		System.out.println("inside constructor AbstractDemo");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("inside AbstractDemo");
		
		//AbstractDemo abs=new AbstractDemo(); obj creation now allowed for abstract class
		abstractMethod();
		
		InterfaceDemo.interfaceDemoMethod();
		InterfaceDemo.interfaceDemoMethod2();
	}
	
	public static void abstractMethod() {
		System.out.println("inside abstractMethod");
	}

}
