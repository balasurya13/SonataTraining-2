package com.sonata.Myservices.sep7;

public class ClassOne {


	public  void print(int n)
	{
		for(int i=1;i<=5;i++)
		System.out.println(n*i);
		
		try { Thread.sleep(500);
		}catch(Exception e) {System.out.println(e);}
	}

	}
