package com.Demo.Collection;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTableDemo {

	public static void main(String[] args) {

		Hashtable<EmployeeEqualsHashcode,Student> ht=new Hashtable<EmployeeEqualsHashcode, Student>();
		
		EmployeeEqualsHashcode e1=new EmployeeEqualsHashcode(1, "omkar");
        EmployeeEqualsHashcode e2=new EmployeeEqualsHashcode(2, "omkar");
        EmployeeEqualsHashcode e3=new EmployeeEqualsHashcode(3, "swapnil");
        EmployeeEqualsHashcode e4=new EmployeeEqualsHashcode(4, "amol");
        
        
        Student s1=new Student(1, "omkar");
        Student s2=new Student(1, "omkar");
		ht.put(e1, s1);
		ht.put(e2, s2);
		ht.put(e3, s1);
		ht.put(e4, s2);

		System.out.println(ht);
		
	    for (Entry<EmployeeEqualsHashcode, Student> entry : ht.entrySet()) {  
	    	 System.out.println("Key = " + entry.getKey() +", Value = " + entry.getValue()); 
	           
		}
		
	}

}
