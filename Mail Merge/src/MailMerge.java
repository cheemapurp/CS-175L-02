import java.util.Scanner;
public class MailMerge
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		String replaceText1 = "Dear <firstName> <lastName>,";
		String replaceText2 = "Please confirm that your address is <houseNumber> <street>.";
		String replaceText3 = "Your answer is <yOrNo>, Goodbye!";
		String promptText1 = "Please enter your first name: ";
		String promptText2 = "Please enter your last name: ";
		String promptText3 = "Please enter your house number: ";
		String promptText4 = "Please enter your street: ";
		String promptText5 = "Is this address ok? ";
		
		System.out.print(promptText1);
		String firstName = in.nextLine();
		System.out.print(promptText2);
		String lastName = in.nextLine();
		System.out.print(promptText3);
		String houseNum = in.nextLine();
		System.out.print(promptText4);
		String streetName = in.nextLine();
		
		System.out.println(replaceText1.replace("<firstName> <lastName>" , firstName + " " + lastName));
		System.out.println(replaceText2.replace("<houseNumber> <street>" , houseNum + " " + streetName));
		System.out.print(promptText5);
		String answer = in.nextLine();
		System.out.println(replaceText3.replace("<yOrNo>" , answer));
		
	}
}