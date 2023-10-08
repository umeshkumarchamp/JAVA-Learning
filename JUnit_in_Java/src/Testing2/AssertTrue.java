package Testing2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Main.App;
import Main.Prime;

class AssertTrue {

	App ob = new App(); 
	Prime p = new Prime();
	@Test
	void test() {
		//fail("Not yet implemented");
		//assertTrue(true,"Values are not match");
		assertTrue(true,()->"Values are not match."); 
	}
	
	@Test
	void test1() {

		assertTrue(()->false,"asd"); 
	}
	
	@Test
	void CheckVowel() {
		assertEquals(1,ob.Vowels("umsh")); 
	}
	
	@Test
	void prime() {
		boolean result = p.checkPrime(21);
		assertTrue(result); 
	}
	
	@Test
	void checkString() {
		boolean result = ob.CheckString("India", "India"); 
		assertTrue(result,"Values are not equal"); 
	}
	
	int arr[] = {1,2,3,4,5}; 
	@Test
	void myArray() {
		assertEquals(18,ob.myMethod(arr));
		
	}
	

}
