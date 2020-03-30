package Interfaces.Payroll;

/**
 * @author Matthaiakis Stergios
 */


public interface Payable {
    void computePay(int hoursWorked);

    void mailCheck();

    double getWeeklyPay();
}
