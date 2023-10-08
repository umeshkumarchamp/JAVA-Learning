package LinkedList_Practice;

import java.util.Iterator;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		
//		LinkedList list = new LinkedList(); 
//		list.add("Umesh"); 
//		list.add(87); 
//		list.add(82.38); 
//		list.add(null); 
//		list.push("Champ");
//		System.out.println(list);
//		System.out.println(list.get(0));
//		
//		list.add(1, "Programmer");
//		System.out.println(list);
//		

		LinkedList<String> lst = new LinkedList<>(); 
		lst.add("India");
		lst.add("Japan"); 
		lst.add("America"); 
		lst.add("Euorope"); 
		lst.add("New Zealand"); 
		lst.add("Germany"); 
		
		System.out.println("First Method : ");
		System.out.println(lst.toString());
		
		System.out.println("\nSecond Method : ");
		for(String s : lst) {
			System.out.println(s);
		}
		
		System.out.println("\nThird Method : ");
		for(int i=0; i<lst.size(); i++) {
			System.out.println(lst.get(i));
		}
		System.out.println("\nFourth Method : ");
		Iterator<String> itr = lst.iterator(); 
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("\nFifth Method : ");
		lst.forEach(val->System.out.println(val));
		System.out.println();
		lst.forEach(System.out::println);
		
	}

}
