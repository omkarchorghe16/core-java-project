package com.Demo.Java8.streams;

public class Employee {

	private int empno;
	private String ename;
	private String job;
	private double salary;
	private int deptNo;

	public Employee() {
	}
	
	public Employee(int empno, String ename, String job, double salary,
			int deptNo) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.salary = salary;
		this.deptNo = deptNo;
	}
	
	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", job=" + job
				+ ", salary=" + salary + "]";
	}

	

}
