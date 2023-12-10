package com.Demo.Java8.funcInterface;

public class Employee {
	private int empId;
	private String empName;
	private String designation;
	
	public Employee() {}
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Employee(int empId, String empName, String designation) {
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
	}

	//public int compare(Employee o1, Employee o2) 
	public int compareById(Employee e1, Employee e2) {
		Integer empId1 = e1.empId;
		Integer empId2 = e2.empId;
		
		return empId1.compareTo(empId2);
	}
	
	public static int compareByName(Employee e1, Employee e2) {
		return e1.empName.compareTo(e2.empName);
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", designation=" + designation + "]";
	}
	
	
}
