

package ExceptionHandling.CatchDemo;

/**
 * @author Matthaiakis Stergios
 */
public class CatchDemo
{
	public static void main(String [] args)
	{
		System.out.println("Instantiating a MyFileUtilities object...");
		MyFileUtilities util = new MyFileUtilities("c:/test.txt");

		System.out.println("Invoking readOneByte() method...");
		System.out.println(util.readOneByte());
	}
}