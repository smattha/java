/*
 * Employee.java
 *
 * Created on 11 ������� 2007, 7:54 ��
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Methods.Inheritance.superDemo;
/**
 * @author Matthaiakis Stergios
 */
public class Employee
{
	String name;
	String address;
	int SSN;
	int number;

	public void mailCheck()
	{
		System.out.println("--------------------------------------------------------");
		System.out.println("Inside Employee mailCheck: " + super.toString());
		System.out.println("Mailing a check to " + this.name + " " + this.address);
	}
}
