package datatypes.primitivies;

/**
 *
 * @author Matthaiakis Stergios
 */
public class StringDemo
{
	public static void main(String [] args)
	{
		System.out.println("--------------------------------------------------------");
		System.out.println("Combine strings");
		String first = "Stergios", last = "Matthaiakis";
		String name = first + " " + last;
		System.out.println("Name = (\"Stergios\"+  \"Matthaiakis\") = " + name);

		System.out.println("--------------------------------------------------------");
		System.out.println("Convert double to string");

		double pi = 3.14159;
		String s = "Hello, " + first;
		System.out.println(s);

		System.out.println("--------------------------------------------------------");
		System.out.println("Order of operations");
		System.out.println("(Hello, Stergios +3.14 +7)  = " + s +" "+ pi + 7);
		System.out.print("(3.14 +7 + Hello, Stergios) =  " );
		System.out.println(pi + 7 +" "+ s);
	}
}
