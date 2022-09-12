package com.sonata.DAO;

public class App {
	public static void main (String [] args)
	{
		
		 Employee s1 = new Employee();
		s1.setEmpid(14);
		s1.setEmpName("balaji");
		s1.setEmpSal(56.2);
		
		EmployeeImpl p1= new EmployeeImpl();
		int a1= p1.save(s1);
		System.out.println(a1);
	}

}
