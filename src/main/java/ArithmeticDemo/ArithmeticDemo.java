/*
 * ArithmeticDemo.java
 */

package ArithmeticDemo;

/**
 * @author Matthaiakis Stergios
 */
public class ArithmeticDemo {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------");
        System.out.println("Priority & Parenthesis");
        System.out.println("	5 + 4 * 6 / 3 - 2= " + (5 + 4 * 6 / 3 - 2));
        System.out.println("	(5 + 4) * 6 / (3 - 2)= " + (5 + 4) * 6 / (3 - 2));


        System.out.println("--------------------------------------------------------");
        System.out.println("Operator ++");
        int x = 5, y, z;
        y = x++;
        System.out.println("x = " + x + " y = " + y);
        x = 5;
        z = ++x;
        System.out.println("x = " + x + " z = " + z);

        System.out.println("--------------------------------------------------------");
        System.out.println("Operator %");
        int m = 15 % 4;
        System.out.println("15%4 = " + m);

        System.out.println("--------------------------------------------------------");
        System.out.println("Operator << ");
        m = 29;
        System.out.println("29 << 2 = " + (m >> 2));

        System.out.println("--------------------------------------------------------");
        System.out.println("Operaror *=");

        double d = 5.0;
        d *= 4.0;
        System.out.println("d = " + d);

        System.out.println("Ternary: " + (x == 5 ? "yes" : "no"));
    }
}


