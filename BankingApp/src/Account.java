
public class Account 
{
	private String name;
	private String accountNumber;
	private Double balance;
	
	public Account(String name, String accountNumber, Double balance)
	{
		this.name= name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	public void setAccountNumber(String num)
	{
		accountNumber = num;
	}
	
	public Double getBalance()
	{
		return balance;
	}
	
	public void setBalance(double balance)
	{
		balance = balance;
	}
	
	public void deposit(double amount)
	{
		balance = balance + amount;
	}
}
