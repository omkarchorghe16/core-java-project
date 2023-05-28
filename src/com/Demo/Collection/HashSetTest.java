package com.Demo.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	 public static void main(String args[])  
	    { 
			Set<Integer> set1= new HashSet<Integer>();
			set1.add(1);
			set1.add(1);
			set1.add(1);
			set1.add(1);
			set1.add(1);
			set1.add(2);
			System.out.println(set1);
			
	        // creating a HashSet 
	        HashSet hs = new HashSet(); 
	          
	        // adding elements to hashset 
	        // using add() method 
	        boolean b1 = hs.add("Geeks"); 
	        boolean b2 = hs.add("GeeksforGeeks"); 
	          
	        // adding duplicate element 
	        boolean b3 = hs.add("Geeks"); 
	          
	        // printing b1, b2, b3 
	        System.out.println("b1 = "+b1); 
	        System.out.println("b2 = "+b2); 
	        System.out.println("b3 = "+b3); 
	          
	        // printing all elements of hashset 
	        System.out.println(hs); 
	              
	        System.out.println("______________________________________________");
	        
	        //Creating One HashSet object
	        HashSet<String> set = new HashSet<String>();
	        //Adding elements to HashSet
	        set.add("RED");
	        set.add("GREEN");
	        set.add("BLUE");
	        set.add("PINK");
	        //Removing "RED" from HashSet
	 
	        set.remove("RED");
	        System.out.println(set);
	        
	        System.out.println("___Student HAshset with JVM equals & hashcode___________________________________________");
	        Set<Student> student=new HashSet<Student>();
	        Student s1=new Student(1, "omkar");
	        Student s2=new Student(1, "omkar");
	        student.add(s1);
	        student.add(s2);
	        System.out.println(student.size());
	        System.out.println(s1.equals(s2));
	        System.out.println((s1==s2));
	        System.out.println(s1.hashCode());
	        System.out.println(s2.hashCode());
	        for (Student student2 : student) {
				System.out.println("foreach="+student2.toString());
			}
	        
	        System.out.println("___Employee HAshset with own equals & hashcode___________________________________________");
	        Set<Employee> employee=new HashSet<Employee>();
	        Employee e1=new Employee(1, "omkar");
	        Employee e2=new Employee(2, "omkar");
	        Employee e3=new Employee(3, "swapnil");
	        Employee e4=new Employee(4, "amol");
	        employee.add(e1);
	        employee.add(e2);
	        employee.add(e3);
	        employee.add(e4);
	        System.out.println(employee.size());
	        System.out.println(e1.equals(e2));
	        System.out.println((e1==e2));
	        System.out.println(e1.hashCode());
	        System.out.println(e2.hashCode());
	        employee.remove(e2);
	        Iterator itr=employee.iterator();
	        while(itr.hasNext()) {
	        	Employee e=(Employee) itr.next();
	        	System.out.println(e);
	        }
	        System.out.println("contains ="+employee.contains(e2));
	        for (Employee employee2 : employee) {
				System.out.println("foreach="+employee2.toString());
			}
	        

	    } 
	 
}
