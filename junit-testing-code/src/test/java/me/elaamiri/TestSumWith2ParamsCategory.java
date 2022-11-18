package me.elaamiri;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import me.elaamiri.categories.OtherCategory;
import me.elaamiri.categories.SumWith2Params;

@RunWith(Categories.class)
@IncludeCategory(SumWith2Params.class)
@ExcludeCategory(OtherCategory.class)
@SuiteClasses({CalculateTest.class, CalculateTest4.class})
public class TestSumWith2ParamsCategory {

}
