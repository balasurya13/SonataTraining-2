package com.sonata.aug26;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
		public List<Book>getBook() {
		
			List<Book> books= new ArrayList<>();
			
			books.add(new Book(1,"core java",400));
			books.add(new Book(2,"hibernate",450));
			books.add(new Book(1,"spring",600));
			books.add(new Book(1,"react js",560));
			return books;
		}
	

}
