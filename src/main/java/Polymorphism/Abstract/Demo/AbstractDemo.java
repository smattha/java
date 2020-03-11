package Polymorphism.Abstract.Demo;

/*
 * @author Matthaiakis Stergios
 */

public class AbstractDemo
{
	public static void main(String [] args)
	{
		System.out.println("--------------------------------------------------------");
		Employee s = new Salary("Thomas Jefferson", "Monticello, VA", 3, 2600.00);
		Employee h = new Hourly("John Adams", "Boston, MA", 2, 2.50);
		//Employee e = new Employee("George W.", "Houston, TX", 43); WILL NOT COMPILE!!!

		System.out.println(s.getName() + "'s pay is $" + s.computePay());

		((Hourly) h).setHoursWorked(50);
		System.out.println(h.getName() + "'s pay is $" + h.computePay());
	}
}
