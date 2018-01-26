import java.util.Scanner;
import java.util.ArrayList;

public class BankApp 
{

	public static void main(String[] args) 
	{
		ArrayList<Account>accountList = new ArrayList<Account>();
		Scanner scanner = new Scanner(System.in); 
		
		processMenuOptions(accountList, scanner);
	}
	
	public static void processMenuOptions(ArrayList<Account> list, Scanner scanner)
	{
		int choice;
		boolean error;
		
		do
		{
			System.out.println("Do you want to: ");
			System.out.println("1. Create New Account");
			System.out.println("2. Display All Account");
			System.out.println("3. Search Account");
			System.out.println("4. Cash Deposit");
			System.out.println("5. Cash Withdraw");
			System.out.println("6. Exit");
			System.out.println("Enter your choice (1-6): ");
			choice = scanner.nextInt();		
			
			error = false;
			
			switch(choice)
			{
				case 1: createNewAccount(list, scanner);
				break;
				case 2: displayAllAccount(list);
				break;
				case 3: searchAccount(list, scanner);
				break;
				case 4:	Cashdeposit(list, scanner);
				break;
				case 5: CashWithdraw(list, scanner);
				break;
				case 6: break;
				default: error = true; break;
			}
			
			if(error)
			{
				System.out.println("Invalid choice. Please enter again");
			}
			
			System.out.println();
		}while(choice != 4);
	}

	public static void createNewAccount(ArrayList<Account> list, Scanner scanner)
	{
		System.out.print("Enter name: ");
		String Skip =scanner.nextLine();
		String theName = scanner.nextLine();
		
		System.out.print("Enter account number: ");
		String theNumber = scanner.nextLine();
		
		System.out.print("Account balance:");
		Double theBalance = scanner.nextDouble();
				
		Account aAccount = new Account(theName, theNumber, theBalance);
		aAccount.setName(theName);
		aAccount.setAccountNumber(theNumber);
		aAccount.setBalance(theBalance);
		list.add(aAccount);
		System.out.println("Account " + theNumber + " was added");
		System.out.println();
	}

	private static void searchAccount(ArrayList<Account> list, Scanner scanner) 
	{
		if (list.size() == 0)
		{
			System.out.println("The list is empty");
		}
		
		else
		{
			boolean found = false;
			int i = 0;
			
			System.out.print("Enter account number: ");
			String Skip =scanner.nextLine();
			String theNumber = scanner.nextLine();
			String theName = null;
			double theBalance = 0;
			
			while ( i < list.size() && !found)
			{
				Account theAccount = list.get(i);
				if (theAccount.getAccountNumber().equals(theNumber))
				{
					found = true;
					theName = theAccount.getName();
					theBalance = theAccount.getBalance();
				}
				else
				{
					i++;
				}
			}
			
			if(found)
			{
				System.out.println(theNumber + "\t" + theName + "\t" + theBalance);
			}
			else 
			{
				System.out.println("The account did not exist in the system");
			}
			System.out.println();
		}
		
	}
	
	private static void displayAllAccount(ArrayList<Account> list)
	{
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println("Number \t Name \t Balance");
			System.out.println(list.get(i).getAccountNumber() + "\t" + list.get(i).getName() + "\t" +list.get(i).getBalance());
		}
	}
	
	private static void Cashdeposit(ArrayList<Account> list, Scanner scanner)
	{
		boolean found = false;
		int i = 0;
		
		System.out.print("Enter account number: ");
		String Skip =scanner.nextLine();
		String theNumber = scanner.nextLine();
		
		while ( i < list.size() && !found)
		{
			Account theAccount = list.get(i);
			if (theAccount.getAccountNumber().equals(theNumber))
			{
				found = true;
			}
			else
			{
				i++;
			}
		}
		
		if(found)
		{
			System.out.print("Enter amount for deposit: ");
			double theAmount = scanner.nextDouble();
			list.get(i).deposit(theAmount);
			System.out.print("New balance is" + list.get(i).getBalance());
		}
		else 
		{
			System.out.println("The account did not exist in the system");
		}
		System.out.println();
	}
	

	private static void CashWithdraw(ArrayList<Account> list, Scanner scanner) 
	{
		
	}
}
