/*
 * ToStringDemo.java
 *
 * Created on 11 ������� 2007, 8:00 ��
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Methods.Inheritance.ToStringDemo;

/**
 * @author Matthaiakis Stergios
 */

public class ToStringDemo {
    public static void main(String[] args) {
        Radio radio = new Radio(7, 100.3, 'F');
        System.out.println("toString returns " + radio.toString());
        System.out.println("toString returns " + radio.toStringSuper());
        System.out.println("Just printing the reference: " + radio);
    }
}
