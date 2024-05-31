package com.Demo.Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapDemo {

	private static Map<String, String> portIdNameMap=new HashMap<String, String> ();
	
	public static void main(String[] args) {

		System.out.println("____Student HashMap with JVM equals & hashcode__________________________________________");
        Map<Student,Integer> student=new HashMap<Student,Integer>();
        Student s1=new Student(1, "omkar");
        Student s2=new Student(1, "omkar");
        student.put(s1,1);
        student.put(s2,1);
        System.out.println("size="+student.size());
        System.out.println("s1.equals(s2)="+s1.equals(s2));
        System.out.println("s1==s2="+(s1==s2));
        System.out.println("s1.hashCode()="+s1.hashCode());
        System.out.println("s2.hashCode()="+s2.hashCode());

        
        
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
        employee.put(e1,1);
        employee.put(e2,1);
        System.out.println("size="+employee.size());
        System.out.println("e1.equals(e2)="+e1.equals(e2));
        System.out.println("e1==e2="+(e1==e2));
        System.out.println("e1.hashCode()="+e1.hashCode());
        System.out.println("e2.hashCode()="+e2.hashCode());

        System.out.println("getting values : "+employee.get(new EmployeeEqualsHashcode(1, "omkar")));
        
        for (Entry<EmployeeEqualsHashcode, Integer> entry : employee.entrySet()) {  
            System.out.println("Key = " + entry.getKey() +", Value = " + entry.getValue()); 
        
          //getting java.util.ConcurrentModificationException if you modify map
          //  if(entry.getKey().equals(e2)) 
          //  	employee.put( new Employee(2, "swapnil"),2);
            
        }
        System.out.println("**********Concurrent Hashmap print*****************");
        Map<EmployeeEqualsHashcode,Integer> empMap=new ConcurrentHashMap<EmployeeEqualsHashcode,Integer>();
        empMap.put(e1,1);
        empMap.put(e2,1);
        for (Entry<EmployeeEqualsHashcode, Integer> entry : empMap.entrySet()) {  
            
          //modification possible in bucket level locking internally on obj
            if(entry.getKey().equals(e1)) {
            	empMap.put( new EmployeeEqualsHashcode(1, "omkar"),2);
            }
            empMap.put( new EmployeeEqualsHashcode(2, "swapnil"),3);
            //System.out.println("Key = " + entry.getKey() +", Value = " + entry.getValue()); 
            
        }
        empMap.forEach((K,V) -> System.out.println(K + ", Value : " + V));
        
        System.out.println("**********Hashmap print*****************");
		setAllPortIdsAndNamesInMap();
		for (Entry<String, String> entry : portIdNameMap.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

		}
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
