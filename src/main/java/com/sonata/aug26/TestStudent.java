package com.sonata.aug26;

import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {

	public static void main(String[] args) {
		ArrayList<Student> s1= new ArrayList<Student>();
		s1.add(new Student(1,"A",23));
		s1.add(new Student(3,"G",26));
		s1.add(new Student (2,"B",21));
		
		Collections.sort(s1);
		for(Student st:s1) {
			System.out.println( st.rollno +" "+ st.name + ""+st.age);
		}
		
		
	}

}
