package Interfaces.Payroll;

/**
 * @author Matthaiakis Stergios
 */

public class PayableDemo {
    public static void main(String[] args) {
        Employee e = new Employee("George Washington", "Mt. Vernon");

        Payroll payroll = new Payroll();
        payroll.payEmployee(e);
        payroll.printPaycheck(e);
    }
}
