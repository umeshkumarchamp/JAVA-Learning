package com.umesh.Interface;

public class BMW implements Car {
	
	String name; 

	public BMW(String name) {
		super();
		this.name = name;
	}


	@Override
	public void getCarDetails() {

		System.out.println("The Car name is "+name);

	}

}
