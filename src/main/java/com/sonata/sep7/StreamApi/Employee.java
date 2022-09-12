package com.sonata.sep7.StreamApi;

public class Employee {
	private int empId;
	private String empName;
	private String dept;
	private double EmpSal;
	
	public Employee (int empid ,String empName, String dept,double EmpSal) {
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
		this.EmpSal = EmpSal;
	}

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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getEmpSal() {
		return EmpSal;
	}

	public void setEmpSal(double empSal) {
		this.EmpSal = empSal;
	
	
}

		

}
