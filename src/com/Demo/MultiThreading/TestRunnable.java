package com.Demo.MultiThreading;

public class TestRunnable implements Runnable {
	public static void main(String[] args) {
		ThreadDemo my1 = new ThreadDemo();
		ThreadDemo my2 = new ThreadDemo();
		new Thread(my1).start();
		new Thread(my2).start();

		(new Thread(new TestRunnable())).start();
		(new Thread(new TestRunnable())).start();
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

		TestRunnable t1=new TestRunnable();
		t1.run();
		t1.run();
	}

	@Override
	public void run() {
		System.out.println("I'm running in runnable!");
	}
}
