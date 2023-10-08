package com.hiber;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptops {

	@Id
	private int serial_no; 
	private String color; 
	private String brand; 
	private String screen_size;
	public Laptops(int serial_no, String color, String brand, String i) {
		this.serial_no = serial_no;
		this.color = color;
		this.brand = brand;
		this.screen_size = i;
	}
	
	
	public Laptops() {
		super();
	}


	@Override
	public String toString() {
		return "Laptops [serial_no=" + serial_no + ", color=" + color + ", brand=" + brand + ", screen_size="
				+ screen_size + "]";
	}

	
	
	
	
	
}
