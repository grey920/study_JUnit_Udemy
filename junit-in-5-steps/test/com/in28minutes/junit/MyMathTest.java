package com.in28minutes.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {
	MyMath myMath = new MyMath();
	
	@Before // Before every test
	public void before() {
		System.out.println("Before");
	}
	
	@After // After every test
	public void after() {
		System.out.println("After");
	}
	
	@BeforeClass // class 레벨 메소드라 static이어야 한다.
	static public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	static public void afterClass() {
		System.out.println("After Class");
	}
	
	//MyMath.sum
	// 1, 2, 3, => 6
	@Test 
	public void sum_with3numbers() {
		System.out.println("Test1");
		assertEquals(6, myMath.sum(new int[] {1,2,3}));
	}
	
	@Test 
	public void sum_with1numbers() {
		System.out.println("Test2");
		assertEquals(3, myMath.sum(new int[] {3}));
	}

}
