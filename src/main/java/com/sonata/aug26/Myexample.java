package com.sonata.aug26;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Myexample {

	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add("a");
		l1.add("b");
		l1.add("c");
		
		System.out.println(l1);
		
		LinkedList l2= new LinkedList(l1);
		l2.addFirst("c");
		l2.addLast("d");
		System.out.println(l2);
		l2.removeLast();
		System.out.println(l2);
		
		HashSet h1= new HashSet(l2);
		h1.add("e");
		System.out.println(h1);
		
		TreeSet t1= new TreeSet(h1);
		t1.add("f");
		System.out.println(t1);
		

	}

}
