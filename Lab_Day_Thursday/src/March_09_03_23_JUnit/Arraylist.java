package March_09_03_23_JUnit;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	// Creating an ArrayList..........
	List<Student> list = new ArrayList<>(); 
	
	// Adding student...
	public void addStudent(Student std) {
		list.add(std); 
	}
	
	// Get the list of students...
	public List<Student> getAllStudent(){
		return list; 
	}
	
	// Get the size of the list....
	public int listSize() { 
		return list.size(); 
	}
	
	
}
