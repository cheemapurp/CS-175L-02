import java.text.DecimalFormat;
import java.util.Scanner;
public class BankAccountTester
{
	public static void main(String[] args)
	{
		DecimalFormat df = new DecimalFormat("###,##0.00");
		Scanner in = new Scanner(System.in);
		System.out.print("Enter starting balance of your account: ");
		double startBalance = in.nextDouble();
		System.out.println();
		System.out.print("Enter the interest rate for your account: ");
		double interest = in.nextDouble();
		System.out.println();
		System.out.println("\tCreated new account with $" + df.format(startBalance) + " and interest rate of " + df.format(interest) + "%");
		System.out.println();
		BankAccount myBankAccount = new BankAccount(startBalance, interest);
		
 		System.out.print("How much would you like to deposit? ");
		double depositAmount = in.nextDouble();
		myBankAccount.deposit(depositAmount);
		System.out.println();
		System.out.println("\tYour balance is now $" + df.format(myBankAccount.getBalance()));
		System.out.println();

		System.out.print("How much would you like to withdraw? ");
		double withdrawAmount = in.nextDouble();
		myBankAccount.withdraw(withdrawAmount);
		System.out.println();
		System.out.print("How much would you like to withdraw? ");
	    double withdrawAmount2 = in.nextDouble();
	    myBankAccount.withdraw(withdrawAmount2);
	    System.out.println();
	    System.out.print("If you want me to generate interest, enter 'Yes': ");
	    String answer = in.next();
	    if (answer.equals("Yes"))
	    {
	    	myBankAccount.calcInterest(interest);
	    }
	    else
	    {
	    	System.out.println("Have a good one!");
	    }
	    
	    System.out.println();
		System.out.println("Your balance is now $" + df.format(myBankAccount.getBalance()));
	}
}
