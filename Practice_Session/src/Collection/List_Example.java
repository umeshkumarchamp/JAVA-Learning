package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List_Example {

	public static void main(String[] args) {
		// List 
		
		
		ArrayList<String> list = new ArrayList<>(); 

		list.add("Sweta"); 
		list.add("Manish"); 
		list.add("Aakash"); 
		list.add("Umesh"); 
		list.add("Muskan"); 
		
		System.out.println("\nFirst Method : ");
		System.out.println(list);
		
		System.out.println("\nSecond Method toString() : ");
		System.out.println(list.toString());
		
		System.out.println("\nThird Method foreach loop : ");
		for(String a : list) {
			System.out.print(a+" ");
		}
		
		System.out.println("\n\nFourth Method : while loop ");
		int count = 0; 
		while(count<list.size()) {
			System.out.print(list.get(count)+" ");
			count++; 
		}
		
		System.out.println("\n\nFifth Method  : Iterator ");
		Iterator<String> itr = list.iterator(); 
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println("\n\nLambda Expression : ");
		list.forEach(val-> System.out.print(val+ " "));
		
		System.out.println();
		System.out.println(list.contains("Umesh"));
		
		list.add(0, "Aakash");
		System.out.println("\n\n"+list);
		
		List<String> list2 = new ArrayList<>(); 
		list2.add("Raghav"); 
		System.out.println(list2);
		list2.addAll(list); 
		System.out.println("\nAfter adding list : ");
		System.out.println(list2);
		
		List<String> list3  = new ArrayList<>(); 
		list3.add("Anupam"); 
		System.out.println("\n\nList 3 :\n"+list3);
		list3.addAll(list2);
		System.out.println("\n\nList 3 :\n"+list3);
		
		System.out.println("\nRemoving element from the list : ");
		System.out.println(list3.remove(2));
		System.out.println("\nAfter remove an element : \n"+list3);
		System.out.println(list3.remove("Umesh"));
		System.out.println("\nAfter removing : \n"+list3);
		
		System.out.println("\nPrinting using for loop : Mehtod 6");
		for(int i=0; i<list3.size(); i++) {
			System.out.print(list3.get(i)+" ");
		}
		
	}

}
