package com.Demo.CoreJava;

public class FinalFinallyFinalize {

	final int a=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
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
