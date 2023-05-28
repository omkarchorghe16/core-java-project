package com.Demo.Collection;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Employee,Student> ht=new Hashtable<Employee, Student>();
		
		Employee e1=new Employee(1, "omkar");
        Employee e2=new Employee(2, "omkar");
        Employee e3=new Employee(3, "swapnil");
        Employee e4=new Employee(4, "amol");
        
        
        Student s1=new Student(1, "omkar");
        Student s2=new Student(1, "omkar");
		ht.put(e1, s1);
		ht.put(e2, s2);
		ht.put(e3, s1);
		ht.put(e4, s2);

		System.out.println(ht);
		
	    for (Entry<Employee, Student> entry : ht.entrySet()) {  
	    	 System.out.println("Key = " + entry.getKey() +", Value = " + entry.getValue()); 
	           
		}
		
	}

}
