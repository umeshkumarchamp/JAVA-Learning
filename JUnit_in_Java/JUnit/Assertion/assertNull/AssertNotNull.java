package Assertion.assertNull;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertNotNull {

	@Test
	void test() {
		//fail("Not yet implemented");
		assertNotNull("umesh");
		assertNotNull(null,"This value is null.");
	}
	@Test
	void AssertNotNUllWithFunctionalInterface() {
		assertNotNull(23,()->"This value is null.");
	}

}
