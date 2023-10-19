package com.Demo.Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListProgram {

	public static void main(String[] args) {
		Student s1=new Student(1, "omkar");
		Student s2=new Student(1, "omkar");
		Student s3=new Student(1, "omkar");
		
		System.out.println("-------------List-------------------------------------");
		List<Student> list=new ArrayList<Student>();
		list.add(s1);list.add(s2);list.add(s3);
		System.out.println("Student size = "+list.size());
		List list1=new ArrayList<>();
		list1.add(1);list1.add(1);list1.add(1);
		System.out.println("int size = "+list1.size());
		
		System.out.println("-------------Set-------------------------------------");
		Set<Student> set=new HashSet<Student>();
		set.add(s1);set.add(s2);set.add(s3);
		//for Obj Student its allowing duplicate value in set bcoz storing based on hashcode of object
		System.out.println("Student size = "+set.size());
		Set set1=new HashSet<>();
		set1.add(1);set1.add(1);set1.add(1);
		System.out.println("int size = "+set1.size());
		Set set2=new HashSet<>();
		set2.add("a");set2.add("a");set2.add("a");
		System.out.println("string size = "+set2.size());
	}

}
