package com.Demo.MultiThreading;

public class MultiThreading extends Thread{

	public void run(){
		//for(int i=0; i<5; i++){
		//	System.out.println("running----");
		//}
		System.out.println("for loop");
		for(;;)
			;
		
		
	}
	
	public void start()  {
		super.start();
		System.out.println("start method"); 
		} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThreading m=new MultiThreading();
		Thread t=new Thread();
		//m.start();
		//m.run();
		System.out.println("before start");
		m.setDaemon(true);
		t.start();
		System.out.println("after start");
		String s="omkar";
		//System.out.println("String ="+s);
		StringBuffer sb=new StringBuffer("omkar");
		executeStringBufferThread(sb);
		//stringbuffer is synchronized so it will take more time to execute at a time one thread is executing
		StringBuilder sb1=new StringBuilder("omkar");
		executeStringBuilderThread(sb1);
		//StringBuilder is non-synchronized so it will take less time to execute at a time multiple threads are executing
	
	}

	private static void executeStringBufferThread (StringBuffer sb) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();  
        for (int i=0; i<10000; i++){  
            sb.append(" Tpoint");  
        }  
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms"); 
	}

	private static void executeStringBuilderThread (StringBuilder sb1) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		 startTime = System.currentTimeMillis();  
	        for (int i=0; i<10000; i++){  
	            sb1.append(" Tpoint");  
	        }  
	        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms"); 
	        
	}

}
