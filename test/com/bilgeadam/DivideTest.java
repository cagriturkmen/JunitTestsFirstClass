package com.bilgeadam;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DivideTest {
	
	Divide divide;
	
	@BeforeEach
	void setUp() {	
	divide = new Divide();
	}
	
	@Test
	void divideTwoNumbers() {		
		
		assertEquals(11, divide.divide(121, 11));
		
	}
	@Test
	void divideZeroToANumber() {
		
		assertEquals(0, divide.divide(0, 11));
	}
	@Test
	void divideANumberToZero() {
		assertThrows(ArithmeticException.class, ()-> divide.divide(121, 0));;
	}
	
	
}
