package com.Demo.Program;

public class ReverseStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input[]= {"pune","mumbai","goa","banglore","Hydrabad"};
		for(int i=input.length-1;i>=0;i=i-2){

		System.out.println(input[i]);
		//both will work
		//i--;
		}
		
	}

}
