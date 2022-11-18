package me.elaamiri;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.MethodRule;
import org.junit.rules.TestName;

public class TestNameRuleTest {
	
	//@Rule
	//public MethodRule name = (MethodRule) new TestName();
	/*
	 java.lang.ClassCastException: 
	 class org.junit.rules.TestName cannot be cast to class 
	 org.junit.rules.MethodRule (org.junit.rules.TestName 
	 and org.junit.rules.MethodRule are in unnamed module 
	 of loader 'app')
	
	 */
	@Rule
	public TestName name1 =  new TestName();
	
	@Test
	public void testA() {
		System.out.println(name1.getMethodName());
		assertEquals("testA", name1.getMethodName());
	}
	
	@Test
	public void testB() {
		System.out.println(name1.getMethodName());
		assertEquals("testB", name1.getMethodName());
	}

}
