package com.Demo.Collection;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapIterators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(1,"Omkar");
		Map<Employee,Boolean> map=new HashMap<>();
		map.put(e1,true);
		System.out.println(map.get(e1));
		System.out.println(map);
		e1.setEmpId(2);
		map.put(e1,true);
		System.out.println(map.get(e1));
		System.out.println(map);
		
		
		System.out.println("------------------------------------------");
		Map<String,String> gfg = new HashMap<String,String>(); 
	      
        // enter name/url pair 
        gfg.put("GFG", "geeksforgeeks.org"); 
        gfg.put("Practice", "practice.geeksforgeeks.org"); 
        gfg.put("Code", "code.geeksforgeeks.org"); 
        gfg.put("Quiz", "quiz.geeksforgeeks.org"); 
        
        System.out.println("*****************Myyyyyyyyyyyyyyyyyyyyyyyy********************");
        System.out.println(gfg);
        System.out.println("*****************Myyyyyyyyyyyyyyyyyyyyyyyy********************");
        System.out.println("*****************entrySet********************");
        // using for-each loop for iteration over Map.entrySet() 
        for (Entry<String, String> entry : gfg.entrySet()) {  
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue()); 
        }
        System.out.println("*****************keySet********************");
        // using keySet() for iteration over keys 
        for (String name : gfg.keySet())  
            System.out.println("key: " + name); 
          
        // using values() for iteration over keys 
        for (String url : gfg.values())  
            System.out.println("value: " + url); 
        
        System.out.println("*****************Iterator********************");
        
        
     // using iterators 
        //Iterator<Map.Entry<String, String>> itr = gfg.entrySet().iterator(); 
          Iterator itr=gfg.entrySet().iterator();
        while(itr.hasNext()) 
        { 
             Entry<String, String> entry = (Entry<String, String>) itr.next(); 
             System.out.println("Key = " + entry.getKey() +  
                                 ", Value = " + entry.getValue()); 
        } 
        
        System.out.println("*****************forEach********************");
     // forEach(action) method to iterate map 
        gfg.forEach((k,v) -> System.out.println("Key = "+ k + ", Value = " + v)); 
        
	}

}
