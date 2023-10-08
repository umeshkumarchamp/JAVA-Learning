package Palindrome.AssertTrue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import March_09_03_23_JUnit.Palindrome;

class AssertTrue {
	
	// Creating object of palindrome class....
	Palindrome ob = new Palindrome(); 
	
	// Checking palindrome test....
	@Test
	void palindrome_test() {
		assertTrue(ob.isPalindrome("umeshsemu")); // test case will be success...
	}
	@Test
	void palindrome_test2() {
		assertFalse(ob.isPalindrome("umesh")); // test case will be success...
	}
	@Test
	void palindrome_test3() {
		assertTrue(ob.isPalindrome("india")); // test case will be failed...
	}
	@Test
	void palindrome_test4() {
		assertFalse(ob.isPalindrome("indiaidni")); // test case will be failed...
	}

}
