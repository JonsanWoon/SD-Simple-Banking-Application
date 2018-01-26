package my.edu.utar.test;

import my.edu.utar.program.Calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest 
{
	@Test
	public void testAddTwoIntegers()
	{
		Calculator cal = new Calculator();
		int result = cal.add(6, 8);
		assertEquals(14, result);
	}
	
	@Test
	public void testSubtracrTwoIntegers()
	{
		Calculator cal = new Calculator();
		int result = cal.subtract(14, 18);
		assertEquals(-4, result);
	}
	
	@Test
	public void testMultiplyTwoIntegers()
	{
		Calculator cal = new Calculator();
		int result = cal.multiply(7, 5);
		assertEquals(35, result);
	}
	
	@Test
	public void testDivideTwoIntegers()
	{
		Calculator cal = new Calculator();
		int result = cal.divide(12, 4);
		assertEquals(3, result);
	}
}
