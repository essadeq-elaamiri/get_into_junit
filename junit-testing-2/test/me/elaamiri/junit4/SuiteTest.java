package me.elaamiri.junit4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({PrepareMyBagTest.class, AddPencilsTest.class})
public class SuiteTest {
	
}
