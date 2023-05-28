package com.Demo.Program;

public class OwnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "hello"; 
		char arrch[]={'h','e','l','l','o'}; 
		//converting char array arrch[] to string str2
		String str2 = new String(arrch); 
		for(int i=0;i<=arrch.length;i++) {
			System.out.println("");
		}
		String s1="";
	   int mid = str.length()/2;
		for(int i=str.length()-1;i>=0;i--) {
			System.out.println(str.charAt(i));
		}
		
		
		String rev=reverseString("Hello");
			System.out.println(rev);
	}

	public static String reverseString(String input){
		char arr[]= input.toCharArray();
		char temp;

		for(int i= 0,j=arr.length-1;i<(arr.length/2);i++,j--){

		 temp=arr[i];
		 arr[i]=arr[j];
		 arr[j]=temp;
		}
		return new String(arr);
	}
}
