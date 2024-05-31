package com.Demo.CoreJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class CustomMarker implements Serializable,Cloneable,CustomMarketInterface{

	private static final long serialVersionUID = 1688159640647835043L;
	
	public Object clone() {
		System.out.println("own clonning ");
		return new Object();
	}
	public void clone1() {
		System.out.println("own clonning 1 ");
	}
	public static void main(String[] args) throws Exception {

		CustomMarker c=new CustomMarker();
		System.out.println("CustomMarker c="+c);
		System.out.println("CustomMarker clone="+c.clone());
		
		 if((c instanceof CustomMarketInterface)){
             System.out.println("successful");
         }
         else {
             throw new Exception("Must implement interface Marker ");
         }     
		
	}
	

}
