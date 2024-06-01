package com.Demo.ExceptionHandling;

public class TryThrowCatchFinally {

	public static void main(String[] args) throws ArithmeticException, Exception {
		
		TryThrowCatchFinally t=new TryThrowCatchFinally();
		
		tryThrowCatchFinallyTest();
	}

	private static void tryThrowCatchFinallyTest() throws Exception,ArithmeticException {
		
		try {
			String error="Error occured";
			System.out.println("line1");
			boolean res=true;
			if(!res) {
				throw new NullPointerException(error);	
			}else {
				throw new ArithmeticException(error);
				
			}
			
			//System.out.println("line2"); //unreachable code bcoz of throw
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("line3");
		}finally {
			System.out.println("line4");
		}
		System.out.println("line5");
	}

}
