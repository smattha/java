package controlStructures;

/**
 *
 * @author Matthaiakis Stergios
 */
public class ContinueDemo
{
	public static void main(String [] args)
	{
		System.out.println("--------------------------------------------------------");
		System.out.println("The for loop");


		for(int i = 10; i > 0; i--)
		{
			if(i % 2 == 0)
			{
				System.out.println("Continue command is about to executed");

				continue;
			}
			System.out.println("Value of i="+i);
		}

	}
}

