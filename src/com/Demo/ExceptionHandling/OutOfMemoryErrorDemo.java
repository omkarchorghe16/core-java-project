package com.Demo.ExceptionHandling;

public class OutOfMemoryErrorDemo {

	public OutOfMemoryErrorDemo() {
	}

	//follow proper coding standered
	//handle Garbage collection ,memory
	//do not write unfinite loop confitions
	//handle in try catch finally
	//monitor with splunk /actuator endpoints
	public static void main(String[] args) {
		try {
		      String[] array = new String[100000 * 100000];
		    } catch (OutOfMemoryError oom) {
		      System.out.println("OutOfMemory Error appeared");
		    }
	}

}
