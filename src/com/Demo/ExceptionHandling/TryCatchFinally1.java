package com.Demo.ExceptionHandling;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TryCatchFinally1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TryCatchFinally1 t=new TryCatchFinally1();
		Boolean res=t.getCorrectResult();
		System.out.println(res);
		
		System.out.println("--------------------------------------");
		
		List<String> list= new ArrayList<String>();
		list.add("first");
		addMoreValues(list);
		System.out.println("List : d"+list);
	}

	private static void addMoreValues(List<String> list) {
		list.add("second");
		list.add("third");
	}

	private Boolean getCorrectResult(){
		// TODO Auto-generated method stub
		try {
			System.out.println("1");
			int a=10/0;
			System.out.println("2");
		}catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("3");
			//throw new ArithmeticException();
		}
		finally {
			System.out.println("5");
		}
		System.out.println("6");
		System.out.println("7");
		return true;
	}

}
