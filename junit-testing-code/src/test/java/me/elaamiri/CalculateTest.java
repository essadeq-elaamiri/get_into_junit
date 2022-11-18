package me.elaamiri;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import me.elaamiri.categories.OtherCategory;
import me.elaamiri.categories.SumWith2Params;

@Category(SumWith2Params.class)
public class CalculateTest {
	Calculate calculate = new Calculate();
	
	int sum = calculate.sum(5, 10);
	int testSum = 15;
	
	@Category(OtherCategory.class)
	@Test
	public void testSum2Integers() {
		System.out.println("CalculateTest");
		System.out.println("@Test sum(): " + sum + " = " + testSum);
		assertEquals(sum, testSum);
	}
}
