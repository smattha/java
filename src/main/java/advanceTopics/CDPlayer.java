/*
 * CDPlayer.java
 *
 * Created on 10 ������� 2007, 7:27 ��
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package advanceTopics;

/**
 * @author MAtthaiakis Stergios
 */
public class CDPlayer extends Electronics
{
	private int songNumber;

	public CDPlayer(int x)
	{
		super();
		//System.out.println("--------------------------------------------------------");
		System.out.println("Constructing a CDPlayer");
		//System.out.println("--------------------------------------------------------");

		songNumber = x;
	}

	{
		//System.out.println("--------------------------------------------------------");
		System.out.println("Inside instance initializer");

	}
}