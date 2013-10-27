package mpr.junit;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(TestCatA.class)
@ExcludeCategory(TestCatB.class)
@SuiteClasses({JUnitCategoryTests1.class, JUnitCategoryTests2.class })

public class JUnitCategories {}
