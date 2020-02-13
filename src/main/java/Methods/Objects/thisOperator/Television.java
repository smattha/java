/*
 * Television.java
 *
 * Created on 13 �������� 2007, 3:38 ��
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Methods.Objects.thisOperator;

/**
 *
 * @author Matthaikais Sterios
 */
public class Television
{
	public int channel;
	public int volume;

	public Television()
	{

		this(4, 10);
		System.out.println("--------------------------------------------------------");
		//System.out.println("Conctroctor );
		System.out.println("Inside no-arg constructor");
	}

	public Television(int c)
	{
		this(c, 10);// this must be the first command of the constructor
		System.out.println("--------------------------------------------------------");
		System.out.println("Inside one-arg constructor");
	}

	public Television(int c, int v)
	{
		System.out.println("Inside two-arg constructor");
		channel = c;
		volume = v;
	}
}