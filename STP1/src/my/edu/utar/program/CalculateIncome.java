package my.edu.utar.program;

import my.edu.utar.program.SaleSalary;;

public class CalculateIncome 
{
	public double calCommision(double baseSalary)
	{
		return baseSalary * 0.05;
	}
	
	public double achivementBonus(int salesAmount)
	{
		if (salesAmount < 40000 )
			return salesAmount * 0.02;
		else if (salesAmount >= 40000 && salesAmount < 100000 )
			return salesAmount * 0.05;
		else if (salesAmount >= 110000 && salesAmount < 400000 )
			return salesAmount * 0.10;
		else if (salesAmount >= 400000 )
			return salesAmount * 0.05;
		else
			return 0;
	}
	
	public double totalSalary(double baseSalary)
}
