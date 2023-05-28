package com.Demo.String;

import java.math.BigDecimal;

public class Student {

	static int sid;
	BigDecimal price;
	
	

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	Student(int id){
		this.sid=id;
	}
	
	int method() {
		return 1;
	}
	
	String method1() {
		return "";
	}

	
	
}
