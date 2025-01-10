package com.Demo.Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListProgram {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("1");
		l.add("2");
		l.add("1");
		
		for(String str : l) {
			if(str.equals("1")) {
				//ConcurrentModificationException
				l.remove("1");
			}
		
		}
			System.out.println("List ="+l);
	}

}
