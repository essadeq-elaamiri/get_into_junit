package me.elaamiri;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import me.elaamiri.categories.SumWith2Params;


public class CalculateTest4 {
	Calculate calculate = new Calculate();
	
	int sum = calculate.sum(5, 10);
	int testSum = 15;
	
	@Category(SumWith2Params.class)
	@Test
	public void testSum2Integers1() {
		System.out.println("CalculateTest 4");
		System.out.println("testSum2Integers1");
		System.out.println("@Test sum(): " + sum + " = " + testSum);
		assertEquals(sum, testSum);
	}
	
	@Test
	public void testSum2Integers2() {
		System.out.println("CalculateTest 4");
		System.out.println("testSum2Integers2");
		System.out.println("@Test sum(): " + calculate.sum(35, 10) + " = " + testSum);
		assertEquals(sum, testSum);
	}
}
