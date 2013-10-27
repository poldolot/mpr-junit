package mpr.junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import mpr.junit.Calculator;

@RunWith(Parameterized.class)
public class CalculatorParameterizedTest {
	
	private double expected;
	private double valueOne;
	private double valueTwo;
	
	@Parameters
	public static Collection<Double[]> getTestParameters() {
		return Arrays.asList(new Double[][] {
			{2.0, 1.0, 1.0}, // oczekiwana, wart1, wart2
			{3.0, 2.0, 1.0}, // oczekiwana, wart1, wart2
			{877.85, 1586.6, -708.75}, // oczekiwana, wart1, wart2
		});
	}
	
	public CalculatorParameterizedTest(double expVal, double valOne, double valTwo) {
		this.expected = expVal;
		this.valueOne = valOne;
		this.valueTwo = valTwo;
	}
	
	@Test
	public void addShouldAdd() {
		Calculator calc = new Calculator();
		assertEquals(expected, calc.add(valueOne, valueTwo), 0.01);
	}

}
