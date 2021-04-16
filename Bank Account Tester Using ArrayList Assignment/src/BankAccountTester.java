import java.util.ArrayList;
public class BankAccountTester
{
	public static void main(String[] args)
	{
		BankAccount gil = new BankAccount("Gil", 500);
		BankAccount joe = new BankAccount("Joe", 1000);
		BankAccount fred = new BankAccount("Fred", 2000);
		BankAccount sally = new BankAccount("Sally", 2500);
		
		ArrayList<BankAccount> accountList = new ArrayList<>();
		
		accountList.add(gil);
		accountList.add(joe);
		accountList.add(fred);
		
		for (BankAccount account : accountList)
		{
			System.out.println("Account Information: \n\n" + account.getAccount());
		}
		
		accountList.add(sally);
		
		for (BankAccount account : accountList)
		{
			if(account.getBalance() >= account.anyAccount(fred) && account.getBalance() >= account.anyAccount(sally) && 
					account.getBalance() >= account.anyAccount(joe) && account.getBalance() >= account.anyAccount(gil))
			{
				System.out.println("Account with highest balance: \n\n" + account.getAccount());
			}
		}
		
		accountList.remove(sally);
		
		for (BankAccount account : accountList)
		{
			if(account.getBalance() >= account.anyAccount(fred) && account.getBalance() >= account.anyAccount(joe) && 
					account.getBalance() >= account.anyAccount(gil))
			{
				System.out.println("Account with highest balance: \n\n" + account.getAccount());
			}
		}
	}
}
