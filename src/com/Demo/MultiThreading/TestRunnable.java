package com.Demo.MultiThreading;

public class TestRunnable implements Runnable {
		public static void main(String[] args) { 
			ThreadDemo my1 = new ThreadDemo(); 
			ThreadDemo my2 = new ThreadDemo(); 
			new Thread(my1).start(); 
			new Thread(my2).start(); 
			
			(new Thread(new TestRunnable())).start();
}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("I'm running in runnable!"); 
		}
}
