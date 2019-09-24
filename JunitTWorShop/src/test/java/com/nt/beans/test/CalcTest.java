package com.nt.beans.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.nt.beans.Calculator;

public class CalcTest {
	@Test
	public void test_sum() {
		Calculator cal=new Calculator();
		int expectedResult=cal.sum(10, 5);
		int actualResult=15;
	assertEquals(expectedResult, actualResult);
	}
	
	
		@Test
		public void test_sub() {
			Calculator cal=new Calculator();
			int expectedResult=cal.sub(10, 5);
			int actualResult=5;
		assertEquals(expectedResult, actualResult);
		}
}
