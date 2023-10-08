package AssertNotEquals;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class AssertNotEqualsDemo {

	@Test
	void test() {
		//fail("Not yet implemented");
		assertNotEquals(12, 42);
	}
	
	@Test
	void assertNotEqualsWithFunctionInterface() {
		assertNotEquals(23, 23,"Values are same");
	}

}
