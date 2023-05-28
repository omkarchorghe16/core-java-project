package com.Demo.Constructor;

public class SuperConstructor {

	public int age=0;
	String name,address;

	SuperConstructor(int age){
		this.age=age;
	}
	SuperConstructor(int age,String name,String address){
		this.age=0;
		this.name=name;
		this.address=address;
	}
	
	
	public SuperConstructor() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("inside super main");
		SuperConstructor s=new SuperConstructor(1, "aa", "bb");
		System.out.println(s);

	}

}
