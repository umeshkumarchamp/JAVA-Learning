package com.umesh.Book;

public class Book_Main {

	public static void main(String[] args) {
		// ARRAY OF OBJECT

		
		Book books[] = new Book[3];
		
		books[0] = new Book("abc","umesh",457.57);
		books[1] = new Book("xyz","ramesh",545.34);
		books[2] = new Book("pqr","rohit",645.24);
		
		//Book mybook = new Book("book1","manish",234.23); 
		
		//System.out.println(books[1].getAuthor()); 
		//System.out.println(books[2].getAuthor());
		//books[1] = null; 
		//System.out.println(books[1]);
		
		// Array of objects
		//Book[] books = {new Book("Abc","Umesh",454.23)};
		/*
		if(books[2] != null)
		{
			System.out.println(books[2].getAuthor());
		}
		*/
		
		// USING FOR LOOP 
		for (int i = 0; i < books.length; i++) {
			System.out.println("Author name :"+books[i].getAuthor());
			System.out.println("Book Title : "+books[i].getTitle());
			System.out.println("Book Price : "+books[i].getPrice());
			System.out.println();
		}
		
		// USING FOREACH LOOP
		for (Book i : books) {
			System.out.println(i.getAuthor());
			System.out.println(i.getTitle());
			System.out.println(i.getPrice());
			System.out.println(i);
		}
		
		
		for (Book book : books) {
			System.out.println(book);
		}
		
		// homework,,
		// 
		
		
		
		
	}

}
