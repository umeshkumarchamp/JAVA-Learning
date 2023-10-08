package com.umesh.finall;

public class Main {

	public static void main(String[] args) {
		// Final Keyword.......
		/*
	     The final keyword is a non-access modifier used for classes, attributes and methods, 
				which makes them non-changeable (impossible to inherit or override). The final keyword
				is useful when you want a variable to always store the same value, like PI (3.14159...).
				The final keyword is called a "modifier"
	 */
				
		Country india = new Country("India",25000,"Delhi"); 
		Country America = new Country("India",25000,"Delhi");
		Country Dubai = new Country("India",25000,"Delhi");
		
		india.populationChange(1234); 

		// static method only belong to class...
		Country.getNumberOfCountry();
		
		
		System.out.println(india);
		
		//india.setName("Dubai");
		
		//india.getDetails("India");


	}

}
