package mpr.junit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(TestCatA.class)
public class JUnitCategoryTests1 {
	@Test
	public void test1() {
		assertTrue(true);
	}

	@Category(TestCatB.class)
	@Test
	public void test2() {
		assertTrue(true);
	}

}
