/*
 * OverloadDemo.java
 *
 * Created on 13 �������� 2007, 3:33 ��
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Methods.Objects.Overload;

/**
 * @author Matthaiakis Stergios
 */
public class OverloadDemo {
    public static void main(String[] args) {
        System.out.println("Instantiating a Calculator...");
        Calculator calc = new Calculator();

        System.out.println("Initializing some variables...");
        int a = 5;
        int b = 8;
        double d1 = 2.5;
        double d2 = -1.0;
        float f = 4.0F;

        int intAnswer = 0;
        double doubleAnswer = 0.0;

        intAnswer = calc.multiply(a, b);
        System.out.println(a + " * " + b + " = " + intAnswer);

        doubleAnswer = calc.multiply(d1, d2);
        System.out.println(d1 + " * " + d2 + " = " + doubleAnswer);

        intAnswer = calc.multiply(b);
        System.out.println(b + " * " + b + " = " + intAnswer);

        intAnswer = calc.multiply(a, b, a);
        System.out.println(a + " * " + b + " * " + a + " = " + intAnswer);

        doubleAnswer = calc.multiply(b, f);
        System.out.println(b + " * " + f + " = " + doubleAnswer);

        doubleAnswer = calc.multiply(d2, f);
        System.out.println(d2 + " * " + f + " = " + doubleAnswer);
    }
}
