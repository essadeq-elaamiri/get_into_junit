package me.elaamiri;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculateTest2 {
	private int expected;
	private int first;
	private int second;
	
	public CalculateTest2(int expected,
			int first,
			int second) {
		this.expected = expected;
		this.first = first;
		this.second = second;
	}
	
	@Parameters
	public static Collection<Integer[]> addNumbers() {
		return Arrays.asList(
				new Integer[][] { 
					{ 3, 1, 2 }, 
					{ 5, 2, 3 },
					{ 7, 3, 4 }, 
					{ 9, 4, 5 }});
	}
	
	@Test
	public void sum() {
		Calculate add = new Calculate();
		System.out.println("Addition with parameters : " + first + " and "
		+ second);
		
		assertEquals(expected, add.sum(first, second));

	}
	
}
