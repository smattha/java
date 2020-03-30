package ExceptionHandling.HandleOrDeclareWrong;

/**
 * @author Matthaiakis Stergios
 */
import java.io.*;

public class HandleOrDeclareWrong
{
	public static void main(String [] args)
	{
		System.out.println("Inside main");
		method1("c:/test12345.txt");
	}

	public static void method1(String fileName)
	{
		System.out.println("Inside method1");
		try {
			method2(fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Leaving method1");
	}

	public static void method2(String fileName) throws IOException {
		System.out.println("Inside method2");
		NotSoLazy util = new NotSoLazy(fileName);
		System.out.println(util.readOneByte());
		System.out.println("Leaving method2");
	}
}
