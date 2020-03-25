package advanceTopics.staticDemo;

/**
 * @author MAtthaiakis Stergios
 */

public class Employee {
    static int counter;
    private String name;
    private String address;
    private int SSN;
    private int number;

    Employee(String name, String address, int SSN) {
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.SSN = SSN;
        this.number = ++counter;
    }

    public static int getCounter() {
        System.out.println("Inside getCounter");
        return counter;
    }

    public void mailCheck() {
        System.out.println("Mailing a check to " + name + ", number " + number);
    }
}