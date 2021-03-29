import java.util.Scanner;
public class BankThreshold
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter opening balance: ");
		double openBal = in.nextDouble();
		System.out.println();
		System.out.print("Enter interest rate: ");
		double interest = in.nextDouble();
	    System.out.println();
	    BankAccount myBank = new BankAccount(openBal, interest);
	    System.out.print("Enter the threshold for your account balance to reach (Enter 'End' to quit): ");
	    
	    while(in.hasNextDouble())
	    {
	    	int months = 0;
	    	double threshold = in.nextDouble();
	    	while (myBank.getBalance() < threshold)
	    	{
	    		myBank.calcInterest(interest);
	    		months++;
	    	}
	    	
	    	System.out.println();
		    System.out.println("It will take " + months + " months to reach the threshold: " + threshold);
	    }
	    
	    if(in.hasNext())
	    {
	    	System.out.println();
	    	System.out.println("Have a good one!");
	    	System.exit(0);
	    }
	    in.close();
	}
}
