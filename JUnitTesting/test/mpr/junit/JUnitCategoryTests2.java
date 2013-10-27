package mpr.junit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(TestCatB.class)
public class JUnitCategoryTests2 {

	@Test
	public void test() {
		assertTrue(true);
	}

}
