package me.elaamiri;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.*;


@Ignore
public class AnnotationsTesting {
	private ArrayList<Integer> testList;
	
	@BeforeClass
	public static void oneExecutionBeforAll() {
		System.out.println("@BeforeClass---|");
	}
	
	@AfterClass
	public static void oneExecutionAfterAll() {
		System.out.println("@AfterClass---|");
	}
	
	@Before
	public void anExecutionBeforeEach() {
		testList = new ArrayList<>();
		System.out.println("@Before---|");
	}
	
	@After
	public void anExecutionAfterEach() {
		testList.clear();
		System.out.println("@After---|");
	}
	
	@Test
	public void isEmptyCollection() {
		assertTrue(testList.isEmpty());
		testList.add(115); // this will be removed because the list 
		// cleared after each test
		System.out.println("@Test [isEmptyCollection]---|");
	}
	
	@Test
	public void isThere1Element() {
		testList.add(115);
		assertEquals(1, testList.size());
		
		System.out.println("@Test [isThere1Element]---|");
	}
	
	@Ignore
	public void ignoredExecution() {
		System.out.println("@Ignore: This execution is ignored");

	}
	
	
	
	
}
