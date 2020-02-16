/*
 * Salary.java
 *
 * Created on 11 ������� 2007, 7:53 ��
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Methods.Inheritance.superDemo;

/**
 *
 * @author Michail
 */
public class Salary extends Employee
{
	float salary;	//annual salary

	public float computePay()
	{
		System.out.println("Computing salary pay for " + super.name);
		return salary/52;
	}

	public void mailCheck()
	{
		System.out.println("Inside Salary mailCheck");
		super.mailCheck();
		System.out.println("Mailed check to " + this.name + " with salary " + this.salary);
	}
}
