package com.Demo.MultiThreading;

public class ThreadDemo extends Thread {
	public void run() {
		System.out.println("I'm running in Thread!");
	}

	public static void main(String args[]) {
		ThreadDemo t1 = new ThreadDemo();
		t1.start();

		// Exception in thread "main" java.lang.IllegalThreadStateException
		// can not start twice
		// t1.start();

	}
}
