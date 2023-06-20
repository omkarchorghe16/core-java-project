package com.Demo.String;

public class MyStringDemo implements Cloneable{

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		System.out.println('j' + 'a' + 'v' + 'a');
		System.out.println("j"+"a"+"v"+"a"); 

		MyStringDemo my=new MyStringDemo();
		my.stringManipulation(my);
		
		
		
	}

	
	private void stringManipulation(MyStringDemo my) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		String s1="abc";
		//Stored in String contant pool 
		// if it present in String pool then it will not create else it create string literal
		String s2=new String ("abc");
		//new keyword always create object it doesnt check in string pool
		
		String s3=new String ("abc");
	
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s1.equals(s2));
		System.out.println(s3==s2);
		
		my.clone();
		//int a=10;
		//Integer a=20;
		my.method(10);
		//my.method(b);
		
		String s="one";
		StringBuffer sb= new StringBuffer("two");
		System.out.println(s.hashCode());
		System.out.println(sb.hashCode());
		s="two";
		sb.append("three")
		;
		System.out.println(s.hashCode());
		System.out.println(sb.hashCode());
	}

	public  void method(int a) {
		// TODO Auto-generated method stub
		System.out.println("int "+a);		
	}

	public void method(Integer a) {
		// TODO Auto-generated method stub
		System.out.println("Integer " + a);
	}
	
}
