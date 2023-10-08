package Assertion.AssertNotEquals;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import March_09_03_23_JUnit.Main;

class AssertNotEqualsDemo {

	Main ob = new Main(); 
	
	@Test
	void add() {
		//fail("Not yet implemented");
		assertNotEquals(53, ob.addition(9, 3) ); // test successful.
	}

	@Test
	void mul() {
		assertNotEquals(28, ob.multiplication(7, 4)); // test unsuccessful.
	}
	
}
