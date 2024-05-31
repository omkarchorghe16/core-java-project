package com.Demo.Constructor;

public class SuperConstructor {

	public int age=0;
	String name,address;

	SuperConstructor(int age){
		this.age=age;
	}
	SuperConstructor(int age,String name,String address){
		this.age=age;
		this.name=name;
		this.address=address;
	}
	
	
	public SuperConstructor() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		System.out.println("inside super main");
		SuperConstructor s=new SuperConstructor(30, "Omkar", "834 washinton ave");
		System.out.println(s);

	}
	@Override
	public String toString() {
		return "SuperConstructor [age=" + age + ", name=" + name + ", address=" + address + "]";
	}

}
