package com.sonata.Myservices.sep7;

import java.util.ArrayList;
import java.util.List;

class MyServiceImpl {
 private MyservicesIntf myService ;
	 MyServiceImpl(){}
		 MyServiceImpl(MyservicesIntf mySer){
			 this.myService =mySer;
			 
		 }
	 public List<String> retriveRelated(String user){
		 List<String> filteredValue =new ArrayList<String>();
		 List<String> allTodo = myService.retriveUsers(user);
		 for (String all: allTodo) {
			 if(all.contains("Spring")) {
				 filteredValue.add(all);
				 
			 }
		 }
		 return filteredValue;
	 }
 }
	
		

	


