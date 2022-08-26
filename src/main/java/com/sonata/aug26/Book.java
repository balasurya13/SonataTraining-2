package com.sonata.aug26;

public class Book {
	private int id;
	private String Name;
	private int page;
	
	
public Book (int id, String Name, int page) {
	this .id=id;
	this.Name=Name;
	this.page= page;
	
}


	public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public int getPage() {
	return page;
}

public void setPage(int page) {
	this.page = page;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
public String toString() {
	return "Book [id=" + id + ", Name=" + Name + ", page=" + page + "]";
}


}
