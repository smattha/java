package datatypes.primitivies;
import java.lang.instrument.Instrumentation;
/**
 *
 * @author MAtthaiakis Stergios
 */
public class IntegerDemo
{
	private static Instrumentation instrumentation;
	public static void main(String [] args)
	{
		System.out.println("--------------------------------------------------------");
		System.out.println("Simple integer");
		int x = 250;
		System.out.println("x is " + x);

		short a, b, c;
		c = 21;
		b = 9;
		a =  (short) (b + c);	//b+c result is integer NOT Short

		System.out.println("a is " + a);
		long y = 12345678987654321L;	//notice the "L"
		System.out.println("y is " + y);

		System.out.println("--------------------------------------------------------");
		System.out.println("Byte and conventions");
		y = x;
		byte s;
		s = (byte) c;
		System.out.println("y is now " + y + " and s is " + s);
	}
}

