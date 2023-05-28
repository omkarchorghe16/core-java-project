package com.Demo.CoreJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class CustomMarker implements Serializable,Cloneable,Runnable,CustomMarketInterface{

	public Object clone() {
		System.out.println("own clonning ");
		return new Object();
	}
	public void clone1() {
		System.out.println("own clonning ");
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		CustomMarker c=new CustomMarker();
		System.out.println(c);
		
		
		
		 if((c instanceof CustomMarketInterface)){
             System.out.println("successfull");
         }
         else {
             throw new Exception("Must implement interface Marker ");
         }     
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("inside run method");
		
	}
	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void dosomthing(int a, double d) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int m(String s) {
		// TODO Auto-generated method stub
		return 0;
	}

}
