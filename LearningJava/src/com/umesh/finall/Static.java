package com.umesh.finall;

public class Static {
	
	private static int numberOfCountries; 
	
	public static void myName() {
		System.out.println("This is Umesh Kumar");
	}

	public static void main(String[] args) {
		// A static method can be accessed without creating an object of the class first:
		
		/*
		 *  The static keyword is a non-access modifier used for methods and attributes. 
		 *  Static methods/attributes can be accessed without creating an object of a class.
		 */
		
		Static.myName();
		
		Country.getNumberOfCountry();

	}

}
