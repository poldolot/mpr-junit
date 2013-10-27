package mpr.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorArithmeticTest {

	@Test
	public void calcShouldAddProperly() {
		Calculator calc = new Calculator();
		assertEquals("wrong sum", 3.5, calc.add(1, 2), 0);
	}

}
