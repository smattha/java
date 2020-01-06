package controlStructures;

/**
 *
 * @author Matthaiakis stergios
 */
public class WhileDemo
{
	public static void main(String [] args)
	{
		System.out.println("--------------------------------------------------------");
		System.out.println("While loop Example");


		System.out.println("--------------------------------------------------------");
		System.out.println("Case 1: i=10,9,8,7,6,5,4,3,2,1");

		//loop #1
		int i = 10;
		while(i > 0)
		{
			System.out.print(i + " ");
			i--;
		}
		System.out.println();

		System.out.println("--------------------------------------------------------");
		System.out.println("Case 2 complex control statement ");

		//loop #2
		int x = 6;
		long acc = 0;
		i = 0;
		while(i <= x)
		{
			acc += i;
			i++;
		}
		System.out.println("Sum = " + acc);

	}
}

