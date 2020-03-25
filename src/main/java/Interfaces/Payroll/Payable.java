package Interfaces.Payroll;

/**
 * @author Matthaiakis Stergios
 */


public interface Payable {
    public void computePay(int hoursWorked);

    public void mailCheck();

    public double getWeeklyPay();
}
