package com.Demo.ExceptionHandling;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class TryThrowCatchFinally {

	public static void main(String[] args) throws ArithmeticException, Exception {
		// TODO Auto-generated method stub
		
		TryThrowCatchFinally t=new TryThrowCatchFinally();
		
		tryThrowCatchFinallyTest();
	}

	private static void tryThrowCatchFinallyTest() throws Exception,ArithmeticException {
		// TODO Auto-generated method stub
		
		try {
			String error="Error occured";
			System.out.println("line1");
			boolean res=true;
			if(!res) {
				throw new NullPointerException(error);	
			}else {
				throw new ArithmeticException(error);
				
			}
			
			//System.out.println("line2");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("line3");
		}finally {
			System.out.println("line4");
		}
		System.out.println("line5");
	}

}
