import java.util.Random;
public class RandArrayAndSearch
{
	public static void main(String[] args)
	{
		Random generator = new Random();
		int[] array = new int[50];
		
		for (int i = 0; i < 50; i++)
		{
			array[i] = 1 + generator.nextInt(25);
			System.out.println(array[i]);
		}
	}
}
