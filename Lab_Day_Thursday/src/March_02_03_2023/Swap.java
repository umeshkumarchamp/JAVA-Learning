package March_02_03_2023;

import java.util.ArrayList;
import java.util.Collections;

public class Swap {

	public static void main(String[] args) {
		// 5. WAP a java program to swap to elements in arrayList.
		
		// Creating an ArrayList....
		ArrayList<Integer> list = new ArrayList<>();
		
		// Adding elements in the list.
		list.add(23); 
		list.add(53); 
		list.add(59); 
		list.add(91); 
		list.add(88); 
		
		// Printing elements before swapping the list...
		System.out.println("ArrayList before swapping : ");
		System.out.println(list);
		
		// Swapping two elements of the given index..
		Collections.swap(list, 0, 1);
		
		// Printing elements after swapping the list..
		System.out.println("ArrayList after swapping : ");
		System.out.println(list);

	}

}
