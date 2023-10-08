package TreeSet_Practice;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {

	public static void main(String[] args) {
		
		/*
		       TreeSet is represented by Red-Black tree
		       TreeSet is not a Thread Safe
		       TreeSet use default natural ordering
		 */
		
//		Set<Integer> set = new TreeSet<>(); 
//		set.add(81); 
//		set.add(12); 
//		set.add(31); 
//		set.add(91); 
//		set.add(28); 
//		set.add(57); 
//		
//		set.forEach(val-> System.out.print(val+" "));

		Test t1 = new Test("Umesh",25); 
		Test t2 = new Test("Roshan",42);
		Test t3 = new Test("Atul",21);
		Test t4 = new Test("Ramesh",28);
		Test t5 = new Test("Mohan",83);
		
		Set<Test> s = new TreeSet<>(); 
		s.add(t1);
		s.add(t2); 
		s.add(t3); 
		s.add(t4); 
		s.add(t5); 
		System.out.println();
		//s.forEach(val->System.out.println(s));
		System.out.println(s);
		
	}

}
