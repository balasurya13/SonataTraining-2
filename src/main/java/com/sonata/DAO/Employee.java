package com.sonata.DAO;

public class Employee {
	int empid;
String empName;
double empSal;

	
 Employee(int empid, String empName, double empSal){
	 this.empid=empid;
	 this.empName=empName;
	 this.empSal=empSal;
 }


public Employee() {
	// TODO Auto-generated constructor stub
}


public int getEmpid() {
	return empid;
}


public void setEmpid(int empid) {
	this.empid = empid;
}


public String getEmpName() {
	return empName;
}


public void setEmpName(String empName) {
	this.empName = empName;
}


public double getEmpSal() {
	return empSal;
}


public void setEmpSal(double empSal) {
	this.empSal = empSal;
}
}

