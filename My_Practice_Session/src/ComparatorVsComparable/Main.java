package ComparatorVsComparable;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		/*
		     * Comparable ->  compareTo(T ob);
		     * Comparator ->  compare(T ob1, T ob2);
		 */  
		
		//Comparator<Student> cp = (ob1, ob2)-> ob1.getRoll() - ob2.getRoll(); 
		Comparator<Student>	 cp = (o1, o2) ->o1.getName().compareToIgnoreCase(o2.getName()) ;
		
		Set<Student> set = new TreeSet<>(cp); 
		set.add(new Student(5,"Ramesh",34,88.9f)); 
		set.add(new Student(9,"Vipul",30,98.2f));
		set.add(new Student(7,"Niraj",26,76.3f));
		set.add(new Student(3,"Dharmesh",15,77.1f));
		set.add(new Student(2,"Jay",35,78.9f));
		set.add(new Student(8,"Gopal",23,87.3f));
		
		//System.out.println(set);
		set.forEach(val-> System.out.println(val));
		
		
	}

}
