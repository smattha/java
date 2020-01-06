package controlStructures;

/**
 *
 * @author Matthaiakis Stergios
 */
public class IfDemo
{
	public static void main(String [] args) {
		System.out.println("--------------------------------------------------------");
		System.out.println("If Example");

		int x = 5;
		double half = 0.0;

		if (x != 0) {
			half = x / 2.0;
			System.out.println("X not equal to zero. X=" + x + ", Half= " + half);
		}

		if (x == 0) {
			System.out.println("The value of x is 0");
		}
	}
}

