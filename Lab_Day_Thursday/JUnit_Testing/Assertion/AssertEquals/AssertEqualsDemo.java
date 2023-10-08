package Assertion.AssertEquals;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import March_09_03_23_JUnit.Main;

class AssertEqualsDemo {

	// Creating Object ...
	Main ob = new Main(); 
	
	@Test
	void add() {
		//fail("Not yet implemented");
		assertEquals(5, ob.addition(3,2)); // test will be success.
	}
	
	@Test
	void mul() {
		assertEquals(9, ob.multiplication(3, 9)); // test not success.
	}

	
	
}
