package me.elaamiri.junit4;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class FirstDayAtSchoolTest {
	
	FirstDayAtSchool firstDayAtSchool = new FirstDayAtSchool();
	
	String[] bag1 = { "Books", "Notebooks", "Pens" };
	String[] bag2 = { "Books", "Notebooks", "Pens", "Pencils" };
	
	@Test
	public void testPrepareMy() {
		System.out.println("Inside testPrepareMyBag()");
		assertArrayEquals(bag1, 
				firstDayAtSchool.prepareMyBag());
	}
	
	@Test
	public void testAddPencils() {
		System.out.println("Inside testAddPencils()");
		assertArrayEquals(bag2, 
				firstDayAtSchool.addPancils());
	}

}
