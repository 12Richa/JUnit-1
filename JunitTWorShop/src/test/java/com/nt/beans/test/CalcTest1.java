package com.nt.beans.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;


import com.nt.beans.Calculator1;



public class CalcTest1 {
	
	
	
	Calculator1 calc= new  Calculator1();
	
	@BeforeClass
	public static void test_sum() {
		
		// Calculator1 calc= new  Calculator1();
		System.out.println("CalcTest1.test_sum()");
		int actualRes=Calculator1.sum(10,1);
		int expectedRes=11;
		
		assertEquals(expectedRes,actualRes);
	}

	@Test
	public void test_sub() {
		
		// Calculator1 calc= new  Calculator1();
		System.out.println("CalcTest1.test_sub()");
		int actualRes=calc.sub(10, 1);
		int expectedRes=9;
		assertEquals(expectedRes, actualRes);

	}

	@Test
	public void test_mul() {
		
		 //Calculator1 calc= new  Calculator1();
		System.out.println("CalcTest1.test_mul()");
		int actualRes=calc.mul(10, -1);
		int expectedRes=10;
		assertEquals(expectedRes, actualRes);
	}



	
	@Test(expected = ArithmeticException.class)
	public  void test_div() {
		
		// Calculator1 calc= new  Calculator1();
		System.out.println("CalcTest1.test_div()");
		int actualRes=calc.div(10, 0);
		int expectedRes=5;
		assertEquals(expectedRes, actualRes);
	}

}


