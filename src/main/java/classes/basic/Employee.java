package classes.basic;

/**
 * @author Matthaiakis Stergios
 */
public class Employee {

    String name;
    String address;
    int number;
    int SSN;
    double salary;

    void mailCheck() {
        System.out.println("--------------------------------------------------------");
        System.out.println("			Mail Check Functio");

        System.out.println("Mailing check to " +
                name + "\n" + address);
    }

    double computePay() {
        return salary / 52;
    }
}
