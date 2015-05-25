package oca.capture01.understandingstrictfp;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class FloatingPointCalculationTest {
	private FloatingPointCalculation calculator;
	
	@Before
	public void setUp() {
		calculator = new FloatingPointCalculation();
	}
	
	@Test
	public void strictfp_divide2_expectedNotSafe() {
		double value = calculator.calc();
		System.out.print(value);
		assertTrue(value == calculator.calcPlatformSafe()); 
	}
	
	@Test
	public void strictfp_divide2_expectedSafe() {
		double value = calculator.calcPlatformSafe();
		System.out.print(value);
	}
}
