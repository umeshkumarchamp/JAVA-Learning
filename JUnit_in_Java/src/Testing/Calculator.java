package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Main.App;

/*
     Methods : - 
     	assertEquals(Excepted value, Actual value);
     	assertEquals(Excepted, Actual, suplier<String> msg); 
     	assertEquals(Excepted, Actual, String msg); 
     	assertTrue(boolean val);
     	assertTrue(boolean val, String msg);
     	assertTrue(boolean val,   
     	
 */


class Calculator {

	App ob = new App(); 
	
	@Test
	void test1() {
		//fail("Not yet implemented");
		
		assertEquals(9, ob.mul(2,3),"Values are not match."); 
	}

	@Test
	void test2() {
		assertEquals(7, ob.add(2,5)); 
	}
	
	@Test
	void test3() {
		assertEquals(2, ob.div(4,2)); 
	}
	
	@Test 
	void test4() {
		assertEquals(5, ob.sub(10,5));
	}
	
	
	
}
