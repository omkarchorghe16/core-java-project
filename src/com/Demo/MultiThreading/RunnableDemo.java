package com.Demo.MultiThreading;

public class RunnableDemo implements Runnable{

	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
		System.out.print(" , inside tasks ="+i);
		}
	}
	
	
	

}
