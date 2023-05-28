package com.Demo.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;



public class UnmodifiableList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> arr=new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		System.out.println("after 1 ="+arr);
		arr.remove(1);
		System.out.println("after 2 ="+arr);
		
		
		System.out.println(arr.get(0));
		arr.add(0, 15);
		System.out.println("after 3 ="+arr);
		List<Integer> l=Collections.unmodifiableList(arr);
		l.remove(1);
		System.out.println("after 4 ="+arr);
		System.out.println("after 4 ="+l);
	}

}
