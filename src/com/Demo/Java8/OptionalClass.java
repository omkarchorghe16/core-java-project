package com.Demo.Java8;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {

		String s=null;
		System.out.println(s);
		//if(s.equals("s")) 
			System.out.println(s);
		
		
		Optional<String> value=Optional.empty();
		if(value.equals("s")) 
			System.out.println(value);
	}

}
