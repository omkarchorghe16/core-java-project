package com.Demo.CoreJava;

//All signatures are valid
public class MainDemo {

	public static void main0(String[] args) {
		System.out.println("Hello World");
	}

	static public void main1(String[] args) {
		System.out.println("static public void main(String[] args)");
	}

	static public void main2(String args[]) {
		System.out.println("static public void main(String args[])");
	}

	static public void main3(String[] args) {
		System.out.println("static public void main(String []args)");
	}

	static public void main4(String... args) {
		System.out.println("static public void main(String... args)");
	}

	static final public void main5(String[] args) {
		System.out.println("static final public void main(String[] args)");
	}
	
	static final strictfp public void main6(String[] args) {
		System.out.println("static final strictfp public void main(String[] args)");
	}
}
