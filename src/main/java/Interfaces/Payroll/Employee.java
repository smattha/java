package Interfaces.Payroll;

/**
 * @author Matthaiakis Stergios
 */

public class Employee implements Payable, EmployeeInfo {
    private String name, address;
    private double weeklyPay;

    public Employee(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String a) {
        address = a;
    }

    public double getWeeklyPay() {
        return weeklyPay;
    }

    public void computePay(int hoursWorked) {
        weeklyPay = hoursWorked * 6.50;
        System.out.println("Weekly pay for " + name + " is $" + weeklyPay);
    }

    public void mailCheck() {
        System.out.println("Mailing check to " + name + " at " + address);
    }
}
