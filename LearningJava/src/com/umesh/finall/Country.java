package com.umesh.finall;

public class Country {
	private final String Name; 
	private int population; 
	private String capital;
	
	public static int numberOfCountries; 
	
	/*
    The final keyword is a non-access modifier used for classes, attributes and methods, 
			which makes them non-changeable (impossible to inherit or override). The final keyword
			is useful when you want a variable to always store the same value, like PI (3.14159...).
			The final keyword is called a "modifier"
*/

	static {
		numberOfCountries = 4; 
	}

	public Country(String name, int population, String capital) {
		super();
		this.Name = name;
		this.population = population;
		this.capital = capital;
		numberOfCountries++; 
	}
	
	public static void getNumberOfCountry() {
		System.out.println(numberOfCountries);
	}


	public void setName(String name) {
		name = Name; 
	}
	
	
	public void populationChange( int change) {
		population += change; 
	}
	
	public void getDetails(String country) {
		System.out.println("Country name : "+country);
	}
	
	
	
	
	
	
	
	
	
}
