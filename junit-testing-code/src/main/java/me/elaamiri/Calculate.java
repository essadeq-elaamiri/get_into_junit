package me.elaamiri;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.event.ListSelectionEvent;

public class Calculate {
	
	public int sum(int var1, int var2) {
		System.out.println(String.format("Adding %d and %d", var1, var2));
		return var1+var2;
	}
	
	public int sum(int... numbers) {
		return Arrays.stream(numbers).sum();
	}

}
