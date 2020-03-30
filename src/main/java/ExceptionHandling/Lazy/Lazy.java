

package ExceptionHandling.Lazy;

/**
 * @author Matthaiakis Stergios
 */
import java.io.*;

public class Lazy
{
	private String fileName;

	public Lazy(String name)
	{
		fileName = name;
	}

	public byte readOneByte()
	{
		FileInputStream file = null;
		byte x = -1;

		System.out.println("Opening file for reading...");
		try {
			file = new FileInputStream(fileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Just opened file: " + fileName);
		System.out.println("Reading one byte from file...");
		try {
			x = (byte) file.read();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Just read " + x);
		return x;
	}
}