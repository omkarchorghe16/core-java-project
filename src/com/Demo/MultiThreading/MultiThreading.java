package com.Demo.MultiThreading;

public class MultiThreading extends Thread {

	public static void main(String[] args) {
	
		StringBuffer sb = new StringBuffer("omkar");
		executeStringBufferThread(sb);
		// stringbuffer is synchronized so it will take more time to execute at a time
		// one thread is executing

		StringBuilder sb1 = new StringBuilder("omkar");
		executeStringBuilderThread(sb1);
		// StringBuilder is non-synchronized so it will take less time to execute at a
		// time multiple threads are executing

	}

	private static void executeStringBufferThread(StringBuffer sb) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			sb.append(" Tpoint");
		}
		System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
	}

	private static void executeStringBuilderThread(StringBuilder sb1) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			sb1.append(" Tpoint");
		}
		System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");

	}

	public void start() {
		super.start();
		System.out.println("start method");
	}
}
