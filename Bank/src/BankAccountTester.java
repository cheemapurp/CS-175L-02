import java.text.DecimalFormat;
import java.util.Scanner;
public class BankAccountTester
{
	public static void main(String[] args)
	{
		DecimalFormat df = new DecimalFormat("###,##0.00");
		Scanner in = new Scanner(System.in);
		BankAccount myBankAccount = new BankAccount();
		
		System.out.print("Enter starting balance of your account: ");
		double startBalance = in.nextDouble();
		myBankAccount.deposit(startBalance);
		System.out.println();
		
		System.out.print("How much would you like to deposit? ");
		double depositAmount = in.nextDouble();
		myBankAccount.deposit(depositAmount);
		System.out.println();
		System.out.println("Your balance is now $" + df.format(myBankAccount.getBalance()));
		System.out.println();

		System.out.print("How much would you like to withdraw? ");
		double withdrawAmount = in.nextDouble();
		myBankAccount.withdraw(withdrawAmount);
		System.out.println();
		System.out.println("Your balance is now $" + df.format(myBankAccount.getBalance()));
		System.out.println();
		
		System.out.println("Thank you have a good one!");
	}
}
