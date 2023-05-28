package com.Demo.String;

public class StringConstantPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Prachi";
		String s1="Prachi";
		String s2=new String("Prachi");
		
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println("************");
		System.out.println(s==s1);
		System.out.println(s==s2);
		System.out.println("************");
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
