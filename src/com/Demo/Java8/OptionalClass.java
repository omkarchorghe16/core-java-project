package com.Demo.Java8;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {

		String s=null;
		System.out.println(s);
		//if(s.equals("s")) //It will give Nullpointer exception
			System.out.println("s ="+s);
		
		
		Optional<String> value=Optional.empty();
		if(value.equals("s")) //It will not give Nullpointer exception
			System.out.println("value ="+value);
	}

}
