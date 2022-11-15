package me.elaamiri;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculateTest {
	Calculate calculate = new Calculate();
	
	int sum = calculate.sum(5, 10);
	int testSum = 15;
	
	@Test
	public void testSum2Integers() {
		System.out.println("@Test sum(): " + sum + " = " + testSum);
		assertEquals(sum, testSum);
	}
}
