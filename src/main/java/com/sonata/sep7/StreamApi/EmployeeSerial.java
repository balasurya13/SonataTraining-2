package com.sonata.sep7.StreamApi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.springframework.util.SystemPropertyUtils;

public class EmployeeSerial {

	public static void main(String[] args) throws IOException 
	{
		
		Employee1 obj =new Employee1(123,"bala","malleshwaram");
		ObjectOutputStream oos=null;
		FileOutputStream fos =null;
		Employee1 ob =null;
		
			try {
				fos = new FileOutputStream("D:\\Employee1.ser");
				oos= new ObjectOutputStream(fos);
				oos.writeObject(obj);
			}
		finally {
			oos.close();
			fos.close();
		}
			
			System.out.println("Serialization Done!");
			
			FileInputStream fis=new FileInputStream("D:\\Employee1.ser");
			ObjectInputStream ois =new ObjectInputStream(fis);
			try {
				ob=(Employee1)ois.readObject();
				ois.close();
				fis.close();
				
			}catch(ClassNotFoundException s) {System.out.println(s);}
			System.out.println("Employee ID is"+ob.getEmpId());
			System.out.println("Employee add is"+ ob.getEmpAdd());
	}

}
