package com.Demo.Java8;

public class DemoJava8 implements DemoInterface1, DemoInterface2 {

	public static void main(String[] args) {
		DemoJava8 d = new DemoJava8();
		// Before Java8 interface
		d.method();

		DemoInterface2.method1();

		d.methodAbs();
		d.methodAbs2();

		// After Java8 interface
		d.carryOutWork(() -> System.out.println(("Do work in lambda exp impl")));

	}

	@Override
	public void method() {
		System.out.println("inside main class");
		DemoInterface1.super.method();
		DemoInterface2.super.method();
	}

	public void carryOutWork(FInterface sfi) {
		sfi.method();
	}

	@Override
	public void methodAbs() {
		System.out.println("inside methodAbs");
	}

	@Override
	public void methodAbs2() {
		System.out.println("inside methodAbs2");

	}

}
