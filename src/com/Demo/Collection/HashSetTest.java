package com.Demo.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String args[]) {
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(1);
		set1.add(2);
		System.out.println("set1=" + set1);

		// creating a HashSet
		HashSet hs = new HashSet();

		// adding elements to hashset
		// using add() method
		boolean b1 = hs.add("Geeks");
		boolean b2 = hs.add("GeeksforGeeks");

		// adding duplicate element
		boolean b3 = hs.add("Geeks");

		// printing b1, b2, b3
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		System.out.println("b3 = " + b3);

		// printing all elements of hashset
		System.out.println("hs=" + hs);

		System.out.println("______________________________________________");

		// Creating One HashSet object
		HashSet<String> set = new HashSet<String>();
		// Adding elements to HashSet
		set.add("RED");
		set.add("GREEN");
		set.add("BLUE");
		set.add("PINK");
		// Removing "RED" from HashSet
		set.remove("RED");
		System.out.println(set);

		System.out.println("___Student HAshset with JVM equals & hashcode___________________________________________");
		Set<Student> student = new HashSet<Student>();
		Student s1 = new Student(1, "omkar");
		Student s2 = new Student(1, "omkar");
		student.add(s1);
		student.add(s2);
		System.out.println("size=" + student.size());
		System.out.println("s1.equals(s2)=" + s1.equals(s2));
		System.out.println("s1==s2=" + (s1 == s2));
		System.out.println("s1.hashCode()=" + s1.hashCode());
		System.out.println("s2.hashCode()=" + s2.hashCode());

		for (Student student2 : student) {
			System.out.println("foreach=" + student2.toString());
		}

		System.out.println("___Employee HAshset with own equals & hashcode___________________________________________");
		Set<EmployeeEqualsHashcode> employee = new HashSet<EmployeeEqualsHashcode>();
		EmployeeEqualsHashcode e1 = new EmployeeEqualsHashcode(1, "omkar");
		EmployeeEqualsHashcode e2 = new EmployeeEqualsHashcode(1, "omkar");
		employee.add(e1);
		employee.add(e2);
		System.out.println("size=" + employee.size());
		System.out.println("e1.equals(e2)=" + e1.equals(e2));
		System.out.println("e1==e2=" + (e1 == e2));
		System.out.println("e1.hashCode()=" + e1.hashCode());
		System.out.println("e2.hashCode()=" + e2.hashCode());

		// employee.remove(e2);
		Iterator itr = employee.iterator();
		while (itr.hasNext()) {
			EmployeeEqualsHashcode e = (EmployeeEqualsHashcode) itr.next();
			System.out.println(e);
		}
		System.out.println("contains =" + employee.contains(e2));
		for (EmployeeEqualsHashcode employee2 : employee) {
			System.out.println("foreach=" + employee2.toString());
		}

	}

}
