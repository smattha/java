/*
 * Calculator.java
 *
 * Created on 13 �������� 2007, 3:33 ��
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Methods.Objects.Overload;

/**
 * @author Matthaiakis Stergios
 */
public class Calculator
{
	public int multiply(int x, int y)
	{
		System.out.println("--------------------------------------------------------");
		System.out.println("Overload method int int");
		System.out.println("Multiply int * int");
		return x * y;
	}

	public double multiply(double x, double y)
	{
		System.out.println("--------------------------------------------------------");
		System.out.println("Overload method int int");
		System.out.println("Multiply double * double");
		return x * y;
	}

	public double multiply(int x, double y)
	{
		System.out.println("--------------------------------------------------------");
		System.out.println("Overload method int double");
		System.out.println("Multiply int * double");
		return x * y;
	}

	public int multiply(int x)
	{
		System.out.println("Multiply int * itself");
		return x * x;
	}

	public int multiply(int x, int y, int z)
	{
		System.out.println("Multiply three ints");
		return x * y * z;
	}
}

