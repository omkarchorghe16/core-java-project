package com.Demo.OOPS;

//Interface are slow as they have to find corresponding implemented method 
public interface InterfaceDemo {
	
	//int  instanceVar; //not allowed in Interface
	static final int var=0; //allowed
	
	//InterfaceDemo(){} //Contructors are not allowed
	
	public void interfaceDemoSignMethod();
	
	public static  void interfaceDemoMethod() {
		System.out.println("inside interfaceDemoMethod");
	}
	
	public static void interfaceDemoMethod2() {
		System.out.println("inside interfaceDemoMethod 2");
	}
	
	public default void interfaceDemoMethod3() {
		System.out.println("inside interfaceDemoMethod 3");
	}
}
