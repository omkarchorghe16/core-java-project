package com.Demo.String;

public class StringBufferBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

}
