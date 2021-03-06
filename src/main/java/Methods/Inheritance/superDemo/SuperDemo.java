/*
 * SuperDemo.java
 *
 * Created on 11 ������� 2007, 7:53 ��
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Methods.Inheritance.superDemo;

/**
 * @author Matthaiakis Stergios
 */
public class SuperDemo {
    public static void main(String[] args) {
        System.out.println("Instantiating an Employee");
        Employee e = new Employee();
        e.name = "Robert Smith";
        e.address = "111 Java Street";
        e.SSN = 999001111;
        e.number = 1;

        System.out.println("--------------------------------------------------------\n\n\n\n");
        System.out.println("Instantiating a Salary");
        Salary s = new Salary();
        s.name = "Jane Smith";
        s.address = "222 Oak Drive";
        s.SSN = 111009999;
        s.number = 2;
        s.salary = 100000.00F;


        System.out.println("--------------------------------------------------------\n\n\n\n");
        System.out.println("*** Invoking mailCheck on e ***");
        e.mailCheck();

        System.out.println();
        System.out.println("*** Invoking mailCheck on s ***");
        s.mailCheck();
    }
}