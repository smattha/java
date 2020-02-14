
package Methods.Inheritance.Constructor;

/**
 * @author Matthaiakis Stergios
 */


class Television
{
	private int channel, volume;

	Television()
	{
		this(4,5);
		System.out.println("Inside Television()");
	}

	private Television(int c, int v)
	{
		System.out.println("Inside Television(int, int)");
		channel = c;
		volume = v;
	}
}