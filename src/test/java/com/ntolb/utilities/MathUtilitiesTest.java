package com.ntolb.utilities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilitiesTest {
	
	MathUtilities instance = new MathUtilities();

	@Test
	void testAddition() {
		assertEquals(5, instance.add(3, 2));
		assertEquals(-1, instance.add(-3, 2));
		assertEquals(1, instance.add(3, -2));
		assertEquals(-5, instance.add(-3, -2));
	}
	
	@Test
	void testSubtraction() {
		assertEquals(1, instance.subtract(3, 2));
		assertEquals(-5, instance.subtract(-3, 2));
		assertEquals(5, instance.subtract(3, -2));
		assertEquals(-1, instance.subtract(-3, -2));
		
	}
	
	@Test
	void testMultiplication() {
		assertEquals(6, instance.multiply(3, 2));
		assertEquals(-6, instance.multiply(-3, 2));
		assertEquals(-6, instance.multiply(3, -2));
		assertEquals(6, instance.multiply(-3, -2));
	}
	
	@Test
	void testDivision() {
		assertEquals(Double.valueOf(1.5), instance.divide(3.0, 2.0));
	}
	
	@Test
	void testDivisionCatch() {
		assertNull(instance.divide(3.0, 0.0));
	}

}
