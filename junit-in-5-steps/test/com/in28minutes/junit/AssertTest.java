package com.in28minutes.junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertTest {

	@Test
	public void test() {
		boolean condn = true;
		assertEquals("true여야 한다", true, condn);
		assertTrue(condn);
		assertFalse(condn);
		//assertArrayEquals(expecteds, actuals); 배열이 동일한지 확인
	}

}
