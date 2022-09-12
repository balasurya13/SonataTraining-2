package com.sonata.Myservices.sep7;

public class ClassTwo extends Thread {
	
	ClassOne d;
	ClassTwo(ClassOne d)
	{
		this.d=d;
	
	}
public void run()
{
	d.print(5);
}
}
