package com.Demo.String;

public class MyStringDemo implements Cloneable{

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		System.out.println('j' + 'a' + 'v' + 'a');
		System.out.println("j"+"a"+"v"+"a"); 

		MyStringDemo my=new MyStringDemo();
		//my.stringManipulation(my);
		
		my.stringStringBufferStringBuilder();
		
	}

	private void stringStringBufferStringBuilder() {
		// TODO Auto-generated method stub
		System.out.println("inside stringStringBufferStringBuilder");
		System.out.println("****************String*******************");
		String s1=new String("omkar");
		System.out.println(s1+" # "+s1.hashCode());
		
		String s2=new String("omkar");
		System.out.println(s2+" # "+s2.hashCode());
		
		System.out.println("****************StringBuffer*******************");
		
		StringBuffer s3=new StringBuffer("omkar");
		StringBuffer s4=new StringBuffer("omkar");
		s3.append(s4);
		System.out.println(s3+" # "+s3.hashCode());
		System.out.println(s4+" # "+s4.hashCode());
		
		System.out.println("****************StringBuilder*******************");
		
		StringBuilder s5=new StringBuilder("omkar");
		StringBuilder s6=new StringBuilder("omkar");
		s5.append(s6);
		System.out.println(s5+" # "+s5.hashCode());
		System.out.println(s6+" # "+s6.hashCode());
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
