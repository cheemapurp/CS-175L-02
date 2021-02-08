import java.util.Scanner;
public class HousePainting
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int Length = 0;
		int Width = 0;
		int Height = 0;
		int WindowNum = 0;
		int LengthWindow = 0;
		int WidthWindow = 0;
		int DoorNum = 0;
		int LengthDoor = 0;
		int WidthDoor = 0;
		double CostPerSqFt = 0;
		double SqFtToPaint = 0;
		double CostToPaint = 0;
		System.out.print("Enter Length of House: ");
		Length = in.nextInt();
		System.out.print("Enter Width of House: ");
		Width = in.nextInt();
		System.out.print("Enter Height of House: ");
		Height = in.nextInt();
		System.out.print("Enter the number of windows of House: ");
		WindowNum = in.nextInt();
		System.out.print("Enter Length of Window: ");
		LengthWindow = in.nextInt();
		System.out.print("Enter Width of Window: ");
		WidthWindow = in.nextInt();
		System.out.print("Enter the number of doors of House: ");
		DoorNum = in.nextInt();
		System.out.print("Enter the Length of Door: ");
		LengthDoor = in.nextInt();
		System.out.print("Enter the Width of Door: ");
		WidthDoor = in.nextInt();
		System.out.print("Enter cost per square foot: ");
		CostPerSqFt = in.nextDouble();
		SqFtToPaint = ((2 * (Length * Width)) + ((2 * (Length * Width)) + ((0.5) * (Length * (Height - Width))))) - ((WindowNum * LengthWindow * WidthWindow) + (DoorNum * LengthDoor * WidthDoor));
		CostToPaint = SqFtToPaint * CostPerSqFt;
		System.out.println();
		
		System.out.println("The Cost to Paint the house is: " + CostToPaint + " USD Dollars.");
	}
}
