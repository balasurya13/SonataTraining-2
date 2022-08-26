package com.sonata.aug26;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyComparator implements Comparator <Book>{
	public int compare(Book o1, Book o2) {
		return o1.getName().compareTo(o2.getName());
	}
}
public class Bookservices {
	public List<Book>getBookinSort() {
		List<Book> books=new BookDAO().getBook();
		Collections.sort( books,new MyComparator());
		return books;
	}

	public static void main(String[] args) {
		System.out.println(new Bookservices().getBookinSort());
	}

}
