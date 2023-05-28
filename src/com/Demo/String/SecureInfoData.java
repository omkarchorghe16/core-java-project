package com.Demo.String;

import java.math.BigDecimal;
import java.util.Currency;

public class SecureInfoData {
	public static void main(String args[]) {
	      String pwd = "string_pass_word";
	      System.out.println("String Password is: " + pwd);
	      char charPwd[] = "char_pass_word".toCharArray();
	      System.out.println("Character Password is: " + charPwd);
	      
	      System.out.println("--------------------------------------");
	      
	      String strPwd = "password"; 
	        char[] charPwd1 = new char[] {'p','a','s','s','w','o','r','d'}; 
	          
	        System.out.println("String password: " + strPwd ); 
	        System.out.println("Character password: " + charPwd1 );
	        
	        BigDecimal b=new BigDecimal(0);
	        
	        System.out.println(b.byteValueExact());
	   }
	}