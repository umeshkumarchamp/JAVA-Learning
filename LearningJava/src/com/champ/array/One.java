package com.champ.array;

import java.util.Random;

public class One {
	
	public void display() {
		System.out.println("This is Umesh"); 
	}

	public static void main(String[] args) {
		// ARRAY IN JAVA
		System.out.println("U M E S H   C H A M P"); 

		Random rand = new Random();
		// it will display elements between 0 to 10
		int n1 = rand.nextInt(10); 
		
		// it will element between 1 to 10
		int n2 = rand.nextInt(1,10);
		
		// if we want to include 1 and 10 also
		int n3 = rand.nextInt(1-1,10+1); 
		
		System.out.println("Random element between 0 to 10  => "+n1);
		System.out.println("Random element between 1 to 10  => "+n2);
		System.out.println("Random element from 0 to 10  => "+n3);
		
		//Testing test = new Testing();
		
		
		
	}

}
