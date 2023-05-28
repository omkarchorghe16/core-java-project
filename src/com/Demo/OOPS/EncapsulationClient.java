package com.Demo.OOPS;

public class EncapsulationClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation e=new Encapsulation();
		e.setAddress("pune");
		e.setName("omkar");
		e.setId(1);
		System.out.println(e);
		
		//Encapsulation e=new Encapsulation();
		e.getName();
		e.getAddress();
		e.getId();
		
		
	}
	

}
