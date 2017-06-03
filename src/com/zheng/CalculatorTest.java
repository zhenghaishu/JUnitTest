package com.zheng;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	Calculator cal;
	
	@Before
	public void setUp() throws Exception {
		cal = new Calculator();
	}

	@Test
	public void testAdd() {
		int res = cal.add(20, 10);
		assertEquals("Add Error！", res, 30);
	}

	@Test
	public void testMinus() {
		int res = cal.minus(20, 10);
		assertEquals("Minus error!", res, 10);
	}

	@Test
	public void testDivide() {
		int res = cal.divide(20, 10);  
		assertEquals("Divide error!", res, 2);  
		res =cal.divide(20, 0); 	
	}

	@Test
	public void testMul() {
	       int res = cal.mul(20, 10);  
	       assertEquals("Multiply error!", res, 200); 
	}
}
