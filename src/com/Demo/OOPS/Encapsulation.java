package com.Demo.OOPS;

//Encapsulation=Data hiding+Abstraction

//Advantages
//Security,Modularity,Maintainability
//Disadvantages
//slow,lines of code will increase
public class Encapsulation {

	private int id;
	private String name;
	String address;
	
	public int getId() {
		//validations
		return id;
	}

	public void setId(int id) {
		//validations
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}



	

	

}
