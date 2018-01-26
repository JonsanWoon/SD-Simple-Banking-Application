
public class Checking extends Account 
{
	public void wihdraw(double amount, double balance)
	{
		balance = balance + (amount * (105/100));
	}
	
	public Checking(String name, String accountNumber, Double balance, double withdraw)
	{
		super(name, accountNumber, balance);
	}
}
