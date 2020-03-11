package Polymorphism.Abstract.AbstractMethods;

/**
 * @author Matthaiakis Stergios
 */

class SmartBoss
{
	void payEmployee(Employee e)
	{
		double pay = e.computePay();
		System.out.println("Just paid " + e.getName() + " $" + pay);
		e.mailCheck();
	}
}
