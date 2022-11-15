package me.elaamiri;

import static org.junit.Assert.*;

import org.junit.*;

public class AssertionsTesting {
	
	
	@Test
	public void testAssertions() {
		String obj1 = "HelloWorld";
		String obj1_cpy = obj1;
		String obj2 = "HelloWorld";
		
		int var1 = 1;
		int var2 = 2;
		
		int [] digitsList1 = {1, 2, 3};
		int [] digitsList2 = {1, 2, 3};
		
		assertTrue(String.format("Assert True: %d == %d",var1, var2), var1+1==var2);
		assertEquals(obj1, obj2);
		assertSame(obj1, obj2);
		assertFalse(!obj1.startsWith(obj2));
//assertNull(var1);
		assertNotNull(var1);
		assertArrayEquals(digitsList1, digitsList2);
		assertNotSame(var1, var2);
		
		// All tests passed
	}
	

}
