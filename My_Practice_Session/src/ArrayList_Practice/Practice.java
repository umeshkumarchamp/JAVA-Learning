package ArrayList_Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Practice {

	public static void main(String[] args) {
		
		// default length of arraylist is 10
//		ArrayList list = new ArrayList(); 
//		list.add("Umesh"); 
//		list.add(78); 
//		list.add(null);
//		System.out.println(list);
//		
		
		List<Integer> list = new ArrayList<>(); 
		list.add(87); 
		list.add(90); 
		list.add(23); 
		list.add(41); 
		list.add(82); 
		
		System.out.println(list);
		System.out.println(list.get(3));
		
		
		Set<String> set = new HashSet<>(); 
		Set<Integer> set2 = new LinkedHashSet<>(); 
		
		

	}

}
