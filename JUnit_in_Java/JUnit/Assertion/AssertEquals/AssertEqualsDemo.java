package Assertion.AssertEquals;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertEqualsDemo {

	@Test
	void test() {
		//fail("Not yet implemented");
		assertEquals(123, 100+23);
		
	}
	
	@Test
	void assertEqualsWithMsg() {
		assertEquals("Abc", "abc","Expected output and actual output is not match.");
	}

}
