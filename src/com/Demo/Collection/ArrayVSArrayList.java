package com.Demo.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.Demo.OOPS.InheritanceChild;
import com.Demo.OOPS.InheritanceParent;

public class ArrayVSArrayList {

	public static void main(String[] args) {

		// It will give number format Exception at runtime
		// Integer i = new Integer(null);

		// It will give compile time error
		// String s1 = new String(null);

		System.out.println("**********Array**********************");
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int array1[] = new int[10];
		array1[0] = 9;
		System.out.println("array length="+array.length);
		System.out.println("array1 length="+array1.length);

		String arrayString[] = { "one", "two", "three", "four", "five" };
		List<String> list1 = Arrays.asList("application/json", "application/xml");
		List<String> list2 = Arrays.asList(arrayString);
		System.out.println(list1);
		System.out.println(list2);

		System.out.println("**********ArrayList*****************");

		ArrayList<Integer> arrList = new ArrayList<Integer>();
		List genList = new ArrayList();

		arrList.add(10);
		arrList.add(20);

		genList.add(10);
		genList.add("omkar");
		genList.add(0, 0); //add 0 to 0th element
		
		modificationArrayList(arrList);
		System.out.println("arrList="+arrList + " size=" + arrList.size());
		System.out.println("genList="+genList + " size=" + genList.size());

		List<Integer> list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println("list="+list);//seq is maintained

		List<Integer> l = new ArrayList<Integer>(2);
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(1);
		l.add(2);
		l.add(3);
		System.out.println("l="+l +" size="+l.size()); //duplicates allowed

		System.out.println("**********Employee List*****************");
		List<EmployeeEqualsHashcode> eList = new ArrayList<EmployeeEqualsHashcode>();
		eList.add(new EmployeeEqualsHashcode(1, "omkar"));
		eList.add(new EmployeeEqualsHashcode(2, "niraj"));
		eList.add(new EmployeeEqualsHashcode(3, "swapnil"));
		eList.add(new EmployeeEqualsHashcode(4, "amol"));
		Iterator itr1 = eList.iterator();
		while (itr1.hasNext()) {
			EmployeeEqualsHashcode e = (EmployeeEqualsHashcode) itr1.next();
			if (e.getEmpName().equals("omkar"))
				System.out.println("Employee found : " + e.getEmpName());
		}

		for (EmployeeEqualsHashcode emp : eList) {
			if (emp.getEmpName().equals("amol"))
				break;
		}
		
		List<InheritanceChild> list3 = new ArrayList<InheritanceChild>();
		InheritanceParent ip = new InheritanceChild();

		System.out.println("**********LinkedList*****************");
		LinkedList linkList = new LinkedList();
		linkList.add(10);
		// linkList.add(10, 100);
		linkList.addFirst(9);
		linkList.addLast(999);
		linkList.addAll(0, genList);
		Iterator itr = linkList.descendingIterator();
		//while (itr.hasNext())
			//System.out.println(itr.next());
		System.out.println(linkList);

	}

	private static void modificationArrayList(ArrayList<Integer> arrList) {

		arrList.add(30);
		arrList.add(40);
	}

}
