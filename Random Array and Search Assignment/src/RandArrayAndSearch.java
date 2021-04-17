import java.util.Random;
public class RandArrayAndSearch
{
	public static void main(String[] args)
	{
		Random generator = new Random();
		int[] array = new int[50];
		
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 10; j++)
			{
				array[j] = 1 + generator.nextInt(25);
				System.out.print(array[j] + " ");
			}
			System.out.println();
			System.out.println();
		}
	}
}
