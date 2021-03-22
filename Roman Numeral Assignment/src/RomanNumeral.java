import java.util.Scanner;
public class RomanNumeral
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int integer = 0;
		String roman = "";
		
		System.out.print("What number would you like to convert to Roman Numerals? ");
		integer = in.nextInt();
		
		while (integer < 1 || integer > 3999)
		{
			System.out.println();
			System.out.println("Invalid Range. Try Again");
			System.out.println();
			System.out.print("What number would you like to convert to Roman Numerals? ");
			integer = in.nextInt();
		}
		
		in.close();
			
		while (integer >= 1000)
		{
			roman += "M";
			integer -= 1000;
		}
		
		while (integer >= 900)
		{
			roman += "CM";
			integer -= 900;
		}
		
		while (integer >= 500)
		{
			roman += "D";
			integer -= 500;
		}
		
		while (integer >= 400)
		{
			roman += "CD";
			integer -= 400;
		}
		
		while (integer >= 100)
		{
			roman += "C";
			integer -= 100;
		}
		
		while (integer >= 90)
		{
			roman += "XC";
			integer -= 90;
		}
		
		while (integer >= 50)
		{
			roman += "L";
			integer -= 50;
		}
		
		while (integer >= 40)
		{
			roman += "XL";
			integer -= 40;
		}
		
		while (integer >= 10)
		{
			roman += "X";
			integer -= 10;
		}
		
		while (integer >= 9)
		{
			roman += "IX";
			integer -= 9;
		}
		
		while (integer >= 5)
		{
			roman += "V";
			integer -= 5;
		}
		
		while (integer >= 4)
		{
			roman += "IV";
			integer -= 4;
		}
		
		while (integer >= 1)
		{
			roman += "I";
			integer -= 1;
		}
		
		System.out.println();
		System.out.println("The Roman Numeral is: " + roman);
	}
}
