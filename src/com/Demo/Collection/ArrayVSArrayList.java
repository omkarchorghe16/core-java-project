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

     
	private static Map<String, String> portIdNameMap=new HashMap<String, String> ();
	
	public static void main(String[] args) {
		
		 //It will give number format Exception at runtime
		 //Integer i = new Integer(null);
		
		 //It will give compile time error
	     //String s1 = new String(null);
	     
		System.out.println("**********Array**********************");
		int array[]= {1,2,3,4,5,6,7,8,9,0};
		String arrayString[]= {"one","two","three","four","five"};
		int array1[]= new int[10];
		array1[0]=9;
		System.out.println(array.length);
		System.out.println(array1.length);
		
		List<String>list1=Arrays.asList("application/json","application/xml");
		List<String>list2=Arrays.asList(arrayString);
		System.out.println(list1);
		System.out.println(list2);
		
		
		System.out.println("**********ArrayList*****************");
		
		ArrayList<Integer> arrList=new ArrayList<Integer>();
		List genList= new ArrayList();
		
		arrList.add(10);
		arrList.add(20);

		genList.add(10);
		genList.add("omkar");
		genList.add(0, 0);;
		modificationArrayList(arrList);
		System.out.println(arrList+" size="+arrList.size());
		System.out.println(genList+" size="+genList.size());

		List<Integer> list=new ArrayList();
		list.add(1);
		list.add(2);
		list.add(1);
		System.out.println(list);
		

		List<Integer> l=new ArrayList<Integer>(2);
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(1);
		l.add(2);
		l.add(3);
		System.out.println(l.size());
		System.out.println(l);
		
		List<EmployeeEqualsHashcode> eList =new ArrayList<EmployeeEqualsHashcode>();
		eList.add(new EmployeeEqualsHashcode(1, "omkar"));
		eList.add(new EmployeeEqualsHashcode(2, "niraj"));
		eList.add(new EmployeeEqualsHashcode(3, "swapnil"));
		eList.add(new EmployeeEqualsHashcode(4, "amol"));
		Iterator itr1=eList.iterator();
		while(itr1.hasNext()){
		EmployeeEqualsHashcode e=(EmployeeEqualsHashcode) itr1.next();
		if(e.getEmpName().equals("omkar"))
		System.out.println("Employee found : "+e.getEmpName()); 
		}
		
		List<InheritanceChild> list3=new ArrayList<InheritanceChild>();
		
		InheritanceParent ip=new InheritanceChild();
		
		System.out.println("**********LinkedList*****************");
		LinkedList linkList=new LinkedList();
		linkList.add(10);
		//linkList.add(10, 100);
		linkList.addFirst(9);
		linkList.addLast(999);
		linkList.addAll(0,genList);
		Iterator itr= linkList.descendingIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println(linkList);
		
		
		
		System.out.println("**********Hashmap print*****************");
		setAllPortIdsAndNamesInMap();
		for (Entry<String, String> entry : portIdNameMap.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

		}
	}

	private static void modificationArrayList(ArrayList<Integer> arrList) {
		
		arrList.add(30);
		arrList.add(40);
	}

	private static void setAllPortIdsAndNamesInMap() {
		String portIds="1612,25115,1695,956,18567,957,2343,1247,1108,202,2965,790";
		String[] confPorts = portIds.split(",");
		//for(int i=0;i<confPorts.length;i++) {
			portIdNameMap.put(confPorts[0], "A");
			portIdNameMap.put(confPorts[1], "B");
			portIdNameMap.put(confPorts[2], "C");
			portIdNameMap.put(confPorts[3], "D");
			portIdNameMap.put(confPorts[4], "E");
			portIdNameMap.put(confPorts[5], "F");
			
			portIdNameMap.put(confPorts[6], "G");
			portIdNameMap.put(confPorts[7], "H");
			portIdNameMap.put(confPorts[8], "I");
			portIdNameMap.put(confPorts[9], "J");
			portIdNameMap.put(confPorts[10], "K");
			portIdNameMap.put(confPorts[11], "L");
		//}
		
		
	}
	
}
