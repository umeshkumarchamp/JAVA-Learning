package ArrayList_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
		
		List<String> list1 = Arrays.asList("Umesh","Manish","Atul","Ramesh"); 
		System.out.println(list1);
		System.out.println(list1.size());
		
		Collection<Integer> list2  = Arrays.asList(2,4,6,8,10); 
		System.out.println(list2);
		System.out.println(list2.size());
		
		ArrayList<String> country = new ArrayList<>();
		country.add("India"); 
		System.out.println("Size of country : "+country.size());
		System.out.println(country);
		
		country.add("America"); 
		country.add("Bhutan"); 
		country.add("Austrialia"); 
		country.add("Africa"); 
		country.add("Japan");
		country.add("China"); 
		country.add("Sri Lanka"); 
		country.add("Japan");
		
		// printing elements of the ArrayList... 
		// 1st Method 
		System.out.println("\nUsing toString method :- ");
		System.out.println(country.toString());

		
		// 2nd Method
		System.out.println("\nUsing For Loop :- ");
		for(int i=0; i<country.size(); i++) {
			System.out.println(country.get(i));
		}
		
		// 3rd Method 
		System.out.println("\nUsing foreach loop :- ");
		for(String s : country) {
			System.out.println(s);
		}
		
		// 4rd Method
		System.out.println("\nUsing Iterator :- ");
		Iterator<String> itr = country.iterator(); 
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// 5th Method 
		System.out.println("\nUsing Lambda Expression :- ");
		//country.forEach(val-> System.out.println(val));
		  //or
		country.forEach(System.out::println);
		
		// Removing element from the ArrayList
		System.out.println("\n\nRemoving element from the ArrayList : ");
		System.out.println("Removed element : "+country.remove("China")); 
		country.forEach(System.out::println);
		System.out.println(country.lastIndexOf("Africa"));
		
		// replace the value or object
		System.out.println("\nReplacing the values or object in ArrayList : - ");
		System.out.println("Before replacing : ");
		System.out.println(country);
		System.out.println("After replacing : ");
		country.set(2, "pakistan");
		System.out.println(country);
		
		System.out.println(country.contains("Nepal"));
		System.out.println("Before Adding new list : - ");
		System.out.println(country);
		List<String> list = Arrays.asList("Hongkong","Brazil","New York");
		country.addAll(list);
		System.out.println("\nAfter adding new list : - ");
		System.out.println(country);
		
		System.out.println("\nBefore removing elements in the ArrayList : - ");
		country.remove("Japan");
		System.out.println("\nAfter removing element from the ArrayList : - ");
		System.out.println(country);
		
		
	}

}
