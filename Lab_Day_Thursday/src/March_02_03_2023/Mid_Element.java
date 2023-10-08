package March_02_03_2023;

import java.util.LinkedList;
import java.util.List;

public class Mid_Element {

	public static void main(String[] args) {
		// 4. Wap to add element at mid of an LinkedList.

		// Creating a Linkedlist...
		LinkedList<Integer> list = new LinkedList<>();
		
		// adding element in the listkedlist....
		list.add(23); 
		list.add(89); 
		list.add(51); 
		list.add(81); 
		list.add(12); 
		list.add(22);  
		
		// printing elements...
		System.out.println("My Linked List :- ");
		System.out.println(list);
		
		// adding element at the middle of the list...
		System.out.println("\nAdding element in the middle of the LinkedList : - ");
		int mid = list.size()/2; 
		list.add(mid, 555);
		System.out.println(list);
		
	}

}
