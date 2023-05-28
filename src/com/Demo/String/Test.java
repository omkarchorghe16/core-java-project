package com.Demo.String;

public class Test {

	public static void main(String[] args) {
		Test t = new Test();
		Student s = new Student(10);

		Student s1 = new Student(35);
		change(s);
		System.out.println(s.sid);
//***********************************************************************
		t.function(new String());
//***********************************************************************	

		String str = "omkar";
		concat1(str);
//str=str+ " chorghe";
		System.out.println(str);
//***********************************************************************

	}

	private static String concat1(String str) {
		// TODO Auto-generated method stub
		str = str + " chorghe";
		return str;
	}

	public void function(Object o) {
		System.out.println("inside object function " + o);
	}

	public void function(String o) {
		System.out.println("inside String function " + o);
	}

	public void function(StringBuffer o) {
		System.out.println("inside StringBuffer function " + o);
	}

	public void function(StringBuilder o) {
		System.out.println("inside StringBuffer function " + o);
	}

	private static void change(Student s) {
		// TODO Auto-generated method stub
		s.sid = s.sid + 10;
	}

}
