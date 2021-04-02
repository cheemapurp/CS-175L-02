import java.util.Scanner;
public class CreditCardRemoveCharacters
{
	public static void main(String[] args)
	{
		String creditCardNumber;
		Scanner in = new Scanner(System.in);
		
		while (true)
		{
			System.out.print("Enter a Credit Card Number or -99 to end: ");
			creditCardNumber = in.nextLine();
			System.out.println();
			
			if (creditCardNumber.equals("-99"))
			{
				System.out.println("Have a good one!");
				System.exit(0);
				break;
			}
			else
			{
				int i = 0;
				while (i < creditCardNumber.length())
				{
					char ch = creditCardNumber.charAt(i);
					if (ch == ' ' || ch == '-')
					{
						String before = creditCardNumber.substring(0, i);
						String after = creditCardNumber.substring(i + 1);
						creditCardNumber = before + after;
					}
					else
					{
						i++;
					}
				}
				System.out.println(creditCardNumber);
				System.out.println();
				continue;
			}
		}
		in.close();
	}
}
