package my.edu.utar.program;

public class Calculator 
{
	public int add (int number1, int number2)
	{
		return number1 + number2;
	}
	
	public int add(int[] numbers)
	{
		int result = 0;
		for (int i = 0; i <numbers.length; i++)
		{
			result += numbers[i];
		}
		return result;
	}
	
	public int subtract(int number1, int number2)
	{
		return number1 - number2;
	}
	
	
	public int multiply(int number1, int number2)
	{
		return number1 * number2;
	}
	
	public int multiply(int[] numbers)
	{
		int result =0; 
		for( int i= 0; i < numbers.length; i++)
		{
			result *= numbers[i];
		}
		return result;
	}
	
	public int divide(int dividend, int divisor)
	{
		return dividend / divisor;
	}
	
	public int divide(int[] numbers)
	{
		int result = 0;
		for (int i= 0; i< numbers.length; i++)
		{
			result /= numbers[i];
		}
		
		return result;
	}
}
