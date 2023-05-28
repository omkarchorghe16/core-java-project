package com.Demo.MultiThreading;

public class ThreadLifeCycle {

	
	
	public static void main(String[] args){ 
		System.out.println("****** LifeCycle of Thread *************************************");
		Thread t = new Thread(); 
		Thread.State e = t.getState(); 
		Thread.State[] ts = e.values(); 
		for(int i = 0; i < ts.length; i++){
		 System.out.println(ts[i]); 
		}
		
		System.out.println("*******************************************");
		
		final class Constants {
	        public static final String name = "PI";
	    }
		
        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println(Constants.name);
            }
            
        });
        
        thread.start();
        System.out.println("After start");
		
		
		
	 } 

}
