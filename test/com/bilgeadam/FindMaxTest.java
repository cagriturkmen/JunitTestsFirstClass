package com.bilgeadam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindMaxTest {

	@Test
	void testFindMax() {
	
		assertEquals(4, FindMax.findMax(new int[] {1,3,4,2}));	
		assertEquals(-1,FindMax.findMax(new int[] {-12,-1,-5,-7}));
		
	}

}
