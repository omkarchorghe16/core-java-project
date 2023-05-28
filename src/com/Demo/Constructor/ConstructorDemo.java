package com.Demo.Constructor;

public class ConstructorDemo extends SuperConstructor{

	int id,age;
	String name,address;
	float salary;
	
	
	/*
	 * ConstructorDemo(){ super(); }
	 */
	
	//need to invoke super() constructor
	ConstructorDemo(int age){ 
		//this();
		  this.age=age;
	  }
	 
	
	ConstructorDemo(int id,int age){
		this(age);
		this.id=id;
	}
	ConstructorDemo(int id,int age,String name,String address){
		this(id,age);
		this.name=name;
		this.address=address;
	}
	
	ConstructorDemo(int id,int age,String name,String address,float salary){
		super(age,name,address);
		this.salary=salary;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
