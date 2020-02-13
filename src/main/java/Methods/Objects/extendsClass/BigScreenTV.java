/*
 * BigScreenTV.java
 *
 * Created on 3 ????????? 2007, 1:32 ??
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Methods.Objects.extendsClass;
/**
 * @author Matthaiakis Stergios
 */
public class BigScreenTV extends Television
{
	public String aspectRatio;
	public short size;

	public BigScreenTV()
	{
		super();
		aspectRatio = "unknown";
		size = 40;
		System.out.println("Inside BigScreenTV()");
	}
}