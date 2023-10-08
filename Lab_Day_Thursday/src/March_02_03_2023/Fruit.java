package March_02_03_2023;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Fruit {

	public static void main(String[] args) {
		// 1. WAP to create an ArrayList , add Some Fruits name and traverse with any three ways.

		// Creating a Arraylist..
		List<String> fruit = new ArrayList<>();
		
		// adding element in the list
		fruit.add("Mango"); 
		fruit.add("Banana"); 
		fruit.add("Orange"); 
		fruit.add("Grapes"); 
		
		// printing elements .... 1st Method
		System.out.println("\nTraverse using toString() method :");
		System.out.println(fruit.toString());

		// printing elements .... 2nd Method
		System.out.println("\nTraverse using foreach : ");
		for(String s : fruit) {
			System.out.print(s+" ");
		}
		
		// printing elements .... 3rd Method
		System.out.println("\n\nUsing For Loop : ");
		for(int i=0; i<fruit.size(); i++) {
			System.out.print(fruit.get(i)+" ");
		}
		
		// printing elements .... 4th Method
		System.out.println("\n\nUsing Lambda Expression : ");
		fruit.forEach(val->System.out.print(val+" "));
		
		// printing elements .... 5th Method
		System.out.println("\n\nUsing Iterator : ");
		Iterator<String> itr = fruit.iterator(); 
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
	}

}
