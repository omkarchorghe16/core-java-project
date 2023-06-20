package com.Demo.String;

public class StringBufferBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBufferBuilder bb=new StringBufferBuilder();
		bb.stringStringBufferStringBuilder();
		
		System.out.println("****************StringBufferBuilder*******************");
		 long startTime = System.currentTimeMillis();  
	        StringBuffer sb = new StringBuffer("Java");  
	        for (int i=0; i<1000000; i++){  
	            sb.append("Tpoint");  
	        }  
	        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
	        
	    	System.out.println("----------------------------------------");
	    	
	        startTime = System.currentTimeMillis();  
	        StringBuilder sb2 = new StringBuilder("Java");  
	        for (int i=0; i<1000000; i++){  
	            sb2.append("Tpoint");  
	        }  
	        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
	}

	private void stringStringBufferStringBuilder() {
		// TODO Auto-generated method stub
		System.out.println("inside stringStringBufferStringBuilder");
		System.out.println("****************String*******************");
		String s1=new String("omkar");
		s1.concat("chorghe");
		System.out.println(s1+" # "+s1.hashCode());
		
		String s2=new String("omkar");
		s2.concat("rajaram chorghe");
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

}
