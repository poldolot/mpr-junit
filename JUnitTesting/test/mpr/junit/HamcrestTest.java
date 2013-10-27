package mpr.junit;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class HamcrestTest {

	@Test
	public void test() {
		String color = "red";
		assertThat(color, is("green"));
	}

}
