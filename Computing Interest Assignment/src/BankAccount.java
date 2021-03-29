public class BankAccount
{
   private double balance;
   double interestPct;

   public BankAccount(double startBal, double interest)
   {
      balance = startBal;
      interestPct = interest;
   }
   
   public void calcInterest(double interestPct)
   {
	   balance = (balance * interestPct) + balance;
   }

   public void deposit(double amount)
   {
      balance += amount;
      System.out.println();
      System.out.println("\tDeposited: " + amount);
   }

   public void withdraw(double amount)
   {
	   if (amount < balance)
	   {
		   balance -= amount;
		   System.out.println();
		   System.out.println("\tWithdrew: " + amount);
	   }
	   else
	   {
		   System.out.println();
		   System.out.println("\tInsufficient Funds to support withdrawal");
	   }
   }
   
   public double getBalance()
   {
      return balance;
   }
}