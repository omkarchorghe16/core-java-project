package com.Demo.Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		System.out.println("____Student HashMap with JVM equals & hashcode__________________________________________");
        Map<Student,Integer> student=new HashMap<Student,Integer>();
        Student s1=new Student(1, "omkar");
        Student s2=new Student(1, "omkar");
        student.put(s1,1);
        student.put(s2,1);
        System.out.println(student.size());
        System.out.println(s1.equals(s2));
        System.out.println((s1==s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        
        
        for (Entry<Student, Integer> entry : student.entrySet()) {  
            System.out.println("Key = " + entry.getKey() +", Value = " + entry.getValue()); 
            
            //getting java.util.ConcurrentModificationException
            //if(entry.getKey().equals(s1)) 
            //	student.put( new Student(2, "swapnil"),2);
            
        }
        
        System.out.println("____Employee HashMap with own equals & hashcode__________________________________________");
        Map<EmployeeEqualsHashcode,Integer> employee=new HashMap<EmployeeEqualsHashcode,Integer>();
        EmployeeEqualsHashcode e1=new EmployeeEqualsHashcode(1, "omkar");
        EmployeeEqualsHashcode e2=new EmployeeEqualsHashcode(1, "omkar");
        EmployeeEqualsHashcode e3=new EmployeeEqualsHashcode(3, "swapnil");
        EmployeeEqualsHashcode e4=new EmployeeEqualsHashcode(4, "amol");
        employee.put(e1,1);
        employee.put(e2,2);
        employee.put(e3,3);
        employee.put(e4,4);
        System.out.println(employee.size());
        System.out.println(e1.equals(e2));
        System.out.println((e1==e2));
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());

        System.out.println("getting values : "+employee.get(new EmployeeEqualsHashcode(1, "omkar")));
        
        for (Entry<EmployeeEqualsHashcode, Integer> entry : employee.entrySet()) {  
            System.out.println("Key = " + entry.getKey() +", Value = " + entry.getValue()); 
        
          //getting java.util.ConcurrentModificationException
          //  if(entry.getKey().equals(e2)) 
          //  	employee.put( new Employee(2, "swapnil"),2);
            
        }
        
	}

}
