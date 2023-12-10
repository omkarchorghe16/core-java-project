package com.Demo.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public strictfp  class  Java8Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double avg;
		 int rating =13;
		 int gmailCount=3;
		 double avg1=rating/gmailCount;
		 Double dd=(double) (rating/gmailCount);
		 
		
	     
		 double tmpX = (new Integer(rating)).doubleValue();
		   double tmpY = (new Integer(gmailCount)).doubleValue(); 
		   
             System.out.println(avg1);
             Double d2=Double.valueOf(tmpX/tmpY);
             Double d= tmpX/tmpY;
             //double ddd = dd.doubleValue();
             System.out.println("d="+d);
             
             System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		List<Employee> employeeList = new ArrayList<Employee>();
        
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		
		
		
		List<String> names1 = new ArrayList<String>();
	      names1.add("Mahesh ");
	      names1.add("Suresh ");
	      names1.add("Ramesh ");
	      names1.add("Naresh ");
	      names1.add("Kalpesh ");
			
	      List<String> names2 = new ArrayList<String>();
	      names2.add("Mahesh ");
	      names2.add("Suresh ");
	      names2.add("Ramesh ");
	      names2.add("Naresh ");
	      names2.add("Kalpesh ");
			
	      Java8Programs tester = new Java8Programs();
	      System.out.println("Sort using Java 7 syntax: ");
			
	      tester.sortUsingJava7(names1);
	      System.out.println(names1);
	      System.out.println("Sort using Java 8 syntax: ");
			
	      tester.sortUsingJava8(names2);
	      System.out.println(names2);
	      
	      
	      List<Integer> lnums= new ArrayList();
	      lnums=Arrays.asList(2,5,6,9,16);
	      
	      List<Integer> lnumbers= new ArrayList();
	      Integer arr[]= {1,2,3,4,5,6,7,8,9,10};
	      lnumbers=Arrays.asList(arr);
	      
	      Collections.sort(lnums,(s1,s2) -> s1.compareTo(s2));
	      System.out.println(lnums);
	      
	      System.out.println("Sort using Java 8 syntax ASC ");
	      List<Integer> sortedList = lnums.stream().sorted().collect(Collectors.toList());
	        sortedList.forEach(System.out::println);
	        
	        List<Employee> empList = employeeList.stream().sorted(Comparator.comparingInt(Employee::getId)).collect(Collectors.toList());
	        empList.forEach(System.out::println);
	        
	        System.out.println("Sort using Java 8 syntax DESC ");
	        List<Integer> sortedListRev = lnums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	        sortedListRev.forEach(System.out::println);
	        
	        List<Employee> empListDesc = employeeList.stream()
	        							.sorted(Comparator.comparingInt(Employee::getId).reversed())
	        							.collect(Collectors.toList());
	        empListDesc.forEach(System.out::println);
	        
	      System.out.println("***********************************************");
	      
	      Map<String, Long> noOfMaleAndFemaleEmployees=
	    		   employeeList.stream()
	    		  .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
	      
	      System.out.println(noOfMaleAndFemaleEmployees);
	      System.out.println("***********************************************");
	    //distinct deparment list
	      employeeList.stream().map(Employee::getDepartment)
          .distinct().forEach(System.out::println);
	      System.out.println("***********************************************");
	      
	      Map<String, Double> avgAgeOfMaleAndFemaleEmployees=
	    		  employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
	    		           
	    		  System.out.println(avgAgeOfMaleAndFemaleEmployees);
	    		  
	      System.out.println("***********************************************");
	      
	      Optional<Employee> highestPaidEmployeeWrapper=
	    		  employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
	    		           
	    		  Employee highestPaidEmployee = highestPaidEmployeeWrapper.get();
	    		           
	    		  System.out.println("Details Of Highest Paid Employee : ");
	    		           
	    		  System.out.println("==================================");
	    		           
	    		  System.out.println("ID : "+highestPaidEmployee.getId());
	    		           
	    		  System.out.println("Name : "+highestPaidEmployee.getName());
	    		           
	    		  System.out.println("Age : "+highestPaidEmployee.getAge());
	    		           
	    		  System.out.println("Gender : "+highestPaidEmployee.getGender());
	    		           
	    		  System.out.println("Department : "+highestPaidEmployee.getDepartment());
	    		           
	    		  System.out.println("Year Of Joining : "+highestPaidEmployee.getYearOfJoining());
	    		           
	    		  System.out.println("Salary : "+highestPaidEmployee.getSalary());

	      
	      System.out.println("***********************************************");
	      
	      employeeList.stream()
          .filter(e -> e.getYearOfJoining() > 2015)
          .map(Employee::getName)
          .forEach(System.out::println);
	      
	      System.out.println("***********************************************");
	      
	      Map<String, Long> employeeCountByDepartment=
	    		  employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
	    		           
	    		  Set<Entry<String, Long>> entrySet = employeeCountByDepartment.entrySet();
	    		           
	    		  for (Entry<String, Long> entry : entrySet)
	    		  {
	    		      System.out.println(entry.getKey()+" : "+entry.getValue());
	    		  }
	    		  
	      System.out.println("***********************************************");
	      
	      System.out.println("***********************************************");
	      
	      System.out.println("***********************************************");
	      
	      Optional<Employee> maxSalaryEmp = 
	              employeeList.stream()
	              .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
	      System.out.println("Employee with max salary:"+ (maxSalaryEmp.isPresent()? maxSalaryEmp.get():"Not Applicable"));
	      
	      Optional<Employee> minAgeEmp =    
	              employeeList.stream()
	              .collect(Collectors.minBy(Comparator.comparing(Employee::getAge)));
	      System.out.println("Employee with min age:"+ (minAgeEmp.isPresent()? minAgeEmp.get():"Not Applicable"));
	 
	      
	      // Compute max salaries by gender 
	      Map<String, Optional<Employee>> maxByGender = employeeList.stream().
	    		  collect(Collectors.groupingBy(Employee::getGender, Collectors.maxBy(Comparator.comparing(Employee::getSalary)))); 
	      System.out.println("Employee with max salary by gender:"+ maxByGender);
	      
	      // Compute sum of salaries by gender 
	      Map<String, Double> totalByGender = employeeList.stream().
	    		  collect(Collectors.groupingBy(Employee::getGender, Collectors.summingDouble(Employee::getSalary))); 
	      System.out.println("Employee with sum of salary by gender:"+ totalByGender);
	      
	      
	      
	      //To find to the 2nd highest sal set n  Alternative solution: 
	      Map<String, Employee> topEmployees = employeeList.stream() 
	    		  .collect(Collectors.toMap( e -> e.name, e -> e, BinaryOperator.maxBy(Comparator.comparingDouble(e -> e.salary)) ));
	      System.out.println("2nd highest salary Employee :"+ topEmployees);
	      
	      //find empname=omkar in below list
	      //Employee e=employeeList.stream().filter(x->x.getName().equals("omkar")).collect(Collectors.toList().);
			
			// Map<String, Long> e=employeeList.stream().collect(Collectors.(Employee::getName, Collectors.);
			 
		    //Boolean b=  Optional.ofNullable("omkar").filter(t -> t.equals("omkar")).isPresent();
		    //Boolean b1=((Stream<Employee>) employeeList).filter(t -> t.getName().equals("omkar")).isPresent();
	      
	      Optional.ofNullable(employeeList).map(s1 -> s1.equals("Paul Niksui")).orElseGet(() -> false).booleanValue();
	      
	      boolean b=employeeList.stream().filter(o -> o.getName().equals("Paul Niksui")).findFirst().isPresent();
	      System.out.println("employee equal using filter ="+b);
	      boolean b1=employeeList.stream().map(Employee::getName).filter("omkar"::equals).findFirst().isPresent();
	      System.out.println("employee equal using map ="+b1);
	      //********************************************************************************
	      
	      
	      
	}

	//sort using java 7
	   private void sortUsingJava7(List<String> names) {   
	      Collections.sort(names, new Comparator<String>() {
	    	  @Override
	         public int compare(String s1, String s2) {
	            return s1.compareTo(s2);
	         }
	      });
	   }
	   
	   //sort using java 8
	   private void sortUsingJava8(List<String> names) {
	      Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
	      
	   }
	   
}
