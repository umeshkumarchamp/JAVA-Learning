package Assertion.AssertEquals;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import March_09_03_23_JUnit.Arraylist;
import March_09_03_23_JUnit.Student;

class ArraylistAssertEquals {

	// Creating object for Arraylist class...
	Arraylist ob = new Arraylist(); 
	
	
	@Test
	void isTrue() {
		ob.addStudent(new Student(101,"Umesh",23,"Ranchi")); 
		ob.addStudent(new Student(102,"Champ",24,"Tata"));
		assertTrue(ob.getAllStudent().isEmpty());
		
	}
	
	@Test
	void isFalse() {
		ob.addStudent(new Student(101,"Umesh",23,"Ranchi")); 
		assertFalse(ob.getAllStudent().isEmpty());
	}
	
	// Test for arraylist size...
	@Test
	void isEquals() {
		ob.addStudent(new Student(101,"Umesh",23,"Ranchi")); 
		assertEquals(5, ob.listSize());
	}
	

}
