package LinkedList_Practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Set_Vs_List {

	public static void main(String[] args) {
		
		/*
		        list                 vs               set
		        ----------------------------------------------
		        indexed                         not indexed
		        ordered                         not ordered always
		        duplicate allowed               doesn't allow duplicate
		 */
		
		
		List<Integer> list = new LinkedList<>(); 
		list.add(89); 
		list.add(23); 
		list.add(83); 
		list.add(39); 
		list.add(89);
		System.out.println("\nList Collection : ");
		System.out.println(list);
		
		
		//Set<String> set = new HashSet<>(); // not ordered & not sorted..
		Set<String> set = new LinkedHashSet<>();  // ordered 
		set.add("India"); 
		set.add("Bhutan"); 
		set.add("America"); 
		set.add("Japan");
		set.add("India"); 
		System.out.println("\nSet Collection : ");
		System.out.println(set);
		System.out.println();

		// TreeSet
		System.out.println("\nTree Set Start : \n");
		System.out.println(getSortedSet());
		
		Set<Integer> s1 = Set.of(3,8,1,2,8);
		// It will throw an exception
		System.out.println(s1);
		
	}
	
	public static Set<Integer> getSortedSet(){
		Set<Integer> set = new TreeSet<>();
		set.add(23); 
		set.add(89); 
		set.add(18); 
		set.add(91); 
		set.add(67); 
		set.add(87); 
		return set; 
		
	}

}
