package Assertion.assertFalse;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class assertFalse {

	@Test
	void test() {
		//fail("Not yet implemented");
		assertFalse(true,()->"This is false");
		assertFalse(()->true,()->"This is msg"); 
		
		assertNull(getClass());
		assertNull(getClass(), "This is msg");
		
		
	}

}
