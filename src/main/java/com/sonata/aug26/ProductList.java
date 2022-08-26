package com.sonata.aug26;

import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;


public class ProductList {

	public static void main(String[] args) {
		
		List<Product> p1 = new LinkedList<Product>();
		p1.add(new Product(123,"TV",345));
		p1.add(new Product(456,"phone",567));
		p1.add(new Product(123,"laptop",897));
		
		for(Product p2:p1) {
			System.out.println(p2.pID +" "+ p2.pName+" " +p2.pPrice);
		}
		
		LinkedList<String> l1= new LinkedList<String>();
		int b=10;
		
		l1.add("bala");
		l1.add("abc");
		l1.add("hello");
		l1.addFirst("Mr");
		l1.addLast("s");
		System.out.println(l1);
		
		Iterator<String> i1=l1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		                        
	}
	
}
