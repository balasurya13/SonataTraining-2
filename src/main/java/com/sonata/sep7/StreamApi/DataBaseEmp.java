package com.sonata.sep7.StreamApi;

import java.util.ArrayList;
import java.util.List;

public class DataBaseEmp {
	public static List<Employee>getEmployee(){
		List<Employee>list=new ArrayList();
		list.add(new Employee(172,"Roshan","IT",5000));
		list.add(new Employee(001,"Stan","social",6000));
		list.add(new Employee(175,"Rohan","defence",8000));
		list.add(new Employee(173,"shan","infra",4000));
		list.add(new Employee(171,"rohith","civil",7000));
		return list;
	}
	

}
