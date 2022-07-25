package com.bilgeadam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeCalculationTest {

	@Test
	void testFindMax() {
	
		assertEquals(4, SomeCalculation.findMax(new int[] {1,3,4,2}));	
		assertEquals(-1,SomeCalculation.findMax(new int[] {-12,-1,-5,-7}));
		
	}
	@Test
	public void testCube() {
		assertEquals(27, SomeCalculation.cube(3));
	}
	@Test
	public void testReverseWord() {
		assertEquals("ym eman si irgac", SomeCalculation.reverseWord("my name is cagri"));
	}
	
}
