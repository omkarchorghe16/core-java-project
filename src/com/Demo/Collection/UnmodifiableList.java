package com.Demo.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;



public class UnmodifiableList {

	public static void main(String[] args) {

		List<Integer> arr=new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		System.out.println("before romove ="+arr);
		arr.remove(1);
		System.out.println("after remove ="+arr);
		
		
		System.out.println(arr.get(0));
		arr.add(0, 15);
		System.out.println("after 3 ="+arr);
		
		List<Integer> l = new ArrayList<Integer>();
		try {
			//Now you can not modify l list ,It will throw Exception
			l = Collections.unmodifiableList(arr);
			l.remove(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("after arr ="+arr);
		System.out.println("after l ="+l);
	}

}
