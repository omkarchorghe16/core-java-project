package com.Demo.ExceptionHandling;


public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatchFinally tcf=new TryCatchFinally();

		
		int res=tcf.testDemoTryCatchFinally();
		System.out.println("Result - "+res);

		//empty try catch giving compile time error
		EmptyTryCatchDemo();

	}

	private static void EmptyTryCatchDemo() {
		// TODO Auto-generated method stub
		//giving compile time error
		try
	     {
	         try
	         {
	        	 //System.out.println("inside 2nd try");
	         }finally {
	        	 
	         }
	     }
		//catch()
	     catch(Exception e)
	     {
	    	 //System.out.println("inside catch");
	     }
	}

	private int testDemoTryCatchFinally() {
		// TODO Auto-generated method stub
		try {
			System.out.println("inside try ");
			int i=10/0;
			return 1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("inside catch");
			return 0;
		}finally {
			System.out.println("inside finally");
			return 3;
		}
		//System.out.println("outside finally");  unreachable code
	}

}
