package March_02_03_2023;

import java.util.HashMap;
import java.util.Map;

public class Mapping {

	public static void main(String[] args) {
		// 2. Write a java Program to count the number of key-values mapping in map?
		
		// Creating a Map 
		Map<Integer, String> map = new HashMap<>();
		
		// adding element in the hashmap
		map.put(111, "India");
		map.put(235, "China"); 
		map.put(351, "America"); 
		map.put(651, "Bhutan"); 
		map.put(251, "Thailand"); 
		
		// printing map
		System.out.println(map);
		
		// display the size of map
		System.out.println("\nSize of Map is "+ map.size());
		

	}

}
