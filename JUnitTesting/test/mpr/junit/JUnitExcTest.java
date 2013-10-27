package mpr.junit;

import org.junit.Test;

public class JUnitExcTest {

	@Test(expected=Exception.class)
	public void test() {
		int val = 1/0;
	}

}
