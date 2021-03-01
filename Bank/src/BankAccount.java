
/**
   A bank account has a balance and a mechanism for
   applying interest or fees at the end of the month.
*/
public class BankAccount
{
   private double balance;
   double interestPct;

   /**
      Constructs a bank account with zero balance.
   */
   public BankAccount()
   {
      balance = 1000;
      interestPct = 0.05;
   }
   
   public void calcInterest(double interestPct)
   {
	   balance = (balance * interestPct) + balance;
   }

   /**
      Makes a deposit into this account.
      @param amount the amount of the deposit
   */
   public void deposit(double amount)
   {
      balance += amount;
   }

   /**
      Makes a withdrawal from this account, or charges a penalty if
      sufficient funds are not available.
      @param amount the amount of the withdrawal
   */
   public void withdraw(double amount)
   {
	   if (amount < balance)
	   {
		   balance -= amount;
	   }
	   else
	   {
		   System.out.println();
		   System.out.println("\tInsufficient Funds to support withdrawal");
	   }
   }
   /**
      Gets the current balance of this bank account.
      @return the current balance
   */
   public double getBalance()
   {
      return balance;
   }
}
