package March_02_03_2023;

import java.util.ArrayList;
import java.util.List;

public class Remove_Element {

	public static void main(String[] args) {
		// 3. WAP to remove 4th element from a ArrayList.
		
		// Creating an ArrayList..
		ArrayList<Integer> list = new ArrayList<>();
		
		// adding element in the list..
		list.add(23); 
		list.add(89); 
		list.add(51); 
		list.add(81); 
		list.add(12); 
		list.add(22); 
		
		// printing elements of the arraylist.
		System.out.println("Array List : ");
		System.out.println(list);
		
		// removing an element that is present at index no 4...
		System.out.println("\n\nArray list after removing element from the index 4th : ");
		list.remove(4); 
		System.out.println(list);
		

	}

}
