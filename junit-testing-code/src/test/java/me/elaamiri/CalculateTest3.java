package me.elaamiri;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculateTest3 {
	
	Calculate calculate = new Calculate();
	
	private int expected;
	private int[] numbers;
	
	//constructor
	public CalculateTest3(int expected, int... numbers) {
		this.expected = expected;
		this.numbers = numbers;
		
	}
	
	// Parameters
	@Parameters
	public static Collection<Object[]> expectedOutputAndInputs(){
		List<Object[]> outputInput = new ArrayList<>();
		outputInput.add(new Object[]{1,new int[]{ 0, 1}});
		outputInput.add(new Object[]{22, new int[]{10, 11, 2}});
		outputInput.add(new Object[]{5, new int[]{0, 1, 2, 1, 1}});
		outputInput.add(new Object[]{11, new int[]{10, 1, 0, 0, 0}});
		outputInput.add(new Object[]{24, new int[]{3, 1, 10, 5, 4, 1}});
		outputInput.add(new Object[]{1, new int[]{0, 1}});
		
		return outputInput;
	}
	
	// Test
	@Test 
	public void testSum() {
		System.out.println(String.format("Test Sum: "));
		assertEquals(expected, calculate.sum(numbers));
	}
}
