package com.Demo.Program;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CheckNumberPalindrome(4554);
		CheckStringPalindrome("level");
	}

	private static void CheckStringPalindrome(String original) {
		// TODO Auto-generated method stub
		 String  reverse = ""; // Objects of String class  
	      int length = original.length();   
	      
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i); 
	      
	      if (original.equals(reverse))  
	         System.out.println("Entered string/number is a palindrome.");  
	      else  
	         System.out.println("Entered string/number isn't a palindrome.");   
	}

	private static void CheckNumberPalindrome(int n) {
		// TODO Auto-generated method stub
		  int r,sum=0,temp;    
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
	}  
	

}
