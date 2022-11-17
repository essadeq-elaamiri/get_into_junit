package me.elaamiri.junit4;

import java.util.Arrays;

public class FirstDayAtSchool {
	public String[] prepareMyBag(){
		String[] schoolBag = {"Books", "Notebooks", "Pens"};
		System.out.println("My school bag now contains : "
				+ Arrays.toString(schoolBag));
		
		return schoolBag;
	}
	
	public String[] addPancils() {
		String[] schoolbag = { "Books", "Notebooks", "Pens", "Pencils" };
		System.out.println("Now my school bag contains: "
		+ Arrays.toString(schoolbag));
		return schoolbag;
	}
}
