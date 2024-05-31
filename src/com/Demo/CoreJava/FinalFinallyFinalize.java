package com.Demo.CoreJava;

public class FinalFinallyFinalize {

	final int a=10;
	public static void main(String[] args) {
		
		try {
			// a=20;  It will give compile time error
			FinalFinallyFinalize f=new FinalFinallyFinalize();
			f=null;
			int b;
			System.out.println("try");
			System.gc();
			//b=10/0;
			System.out.println("after exception");
			
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("catch ");
		}finally {
			System.out.println("always executes");
		}
	}
	
	@Override  
    protected void finalize()   
    {   
        System.out.println("finalize method called");   
    }

}
