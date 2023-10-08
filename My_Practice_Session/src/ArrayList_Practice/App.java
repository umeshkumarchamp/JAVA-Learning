package ArrayList_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class App {

	public static void main(String[] args) {

		ArrayList<String> arrlist = new ArrayList<>(); 
		//arrlist.addAll("umesh","dinesh","mahesh","ramesh");
		arrlist.add("umesh"); 
		arrlist.add("atul"); 
		arrlist.add("manish"); 
		arrlist.add("rahul"); 
		
		System.out.println("ArrayList : "+arrlist);
		
		// converting arraylist into normal array......
		String[] names = new String[arrlist.size()]; 
		arrlist.toArray(names); 
		System.out.print("Array :");
		for(String s : names) {
			System.out.print(s+" ");
		}
		
		// converting Array to ArrayList...
		
		System.out.println("\n\nConvert Array to ArrayList : ");
		String[] country = {"india","america","bhutan","china"};
		System.out.print("Array : ");
		for(String s : country) {
			System.out.print(s+", ");
		}
		
		ArrayList<String> mylist = new ArrayList<>(Arrays.asList(country)); 
		System.out.println("\nArrayList : "+ mylist);
		
		Collection<String> mystr = new ArrayList<>(); 
		mystr.add("champ"); 
		System.out.println(mystr);

	}

}
