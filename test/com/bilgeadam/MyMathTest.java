package com.bilgeadam;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.bilgeadam.MyMath;

class MyMathTest {
	
	@BeforeEach
	public  void before() {

		System.out.println("Before");
	}
	
	@AfterEach
	public void after() {
		
		System.out.println("After");
	}
	@BeforeAll
	public static void beforeAll() {
		System.out.println("BeforeAll");
	}
	@AfterAll
	public static void afterAll() {
		System.out.println("AfterAll");
	}
	

	@Test
	void sum_with3numbers() {
		
		MyMath myMath = new MyMath();
		int result = myMath.sum(new int[] {2,4,3});
		
		assertEquals(9, result);
		System.out.println("inside sum wtih 3numbers test");
	}
	
	@Test
	void sum_with2numbers() {
		MyMath myMath = new MyMath();
		int result = myMath.sum(new int[] {5,7});
		assertEquals(12,result);
		System.out.println("inside sum wtih 2numbers test");

	}

}
