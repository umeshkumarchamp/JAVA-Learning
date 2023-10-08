package Assertion.AssertEquals;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import March_09_03_23_JUnit.Square;

class SquareAssertEqualsDemo {

	Square ob = new Square(); 
	@Test
	void test() {
		int arr[] = {2,3};
		int arr2[] = {4,9};
		assertEquals(arr2, ob.squareOfSeries(arr));
	}

}
