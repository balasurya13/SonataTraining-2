package com.sonata.Myservices.sep7;

import java.util.Arrays;
import java.util.List;

public class MyServiceStub implements MyservicesIntf{

	@Override
	public List<String> retriveUsers(String users) {
		
			return Arrays.asList("Learn Spring MVC","Learn Spring","Learn to Dance");
	
		
		
	}
	
}
	
	
	
	


