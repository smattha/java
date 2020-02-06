/*
 * ThisDemo.java
 *
 * Created on 13 Απρίλιος 2007, 3:38 μμ
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ThisDemo;

/**
 *
 * @author Michail
 */
public class ThisDemo
{
	public static void main(String [] args)
	{
		System.out.println("Instantiating first television");
		Television t1 = new Television();
		System.out.println(t1.volume + " " + t1.channel);

		int channel = 206;
		System.out.println("Instantiating second television");
		Television t2 = new Television(channel);
		System.out.println(t2.volume + " " + t2.channel);

		int volume = 7;
		System.out.println("Instantiating third television");
		Television t3 = new Television(channel, volume);
		System.out.println(t3.volume + " " + t3.channel);
	}
}
