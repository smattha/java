package controlStructures;

/**
 * @author Matthaiakis Stergios
 */
public class ForDemo {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------");
        System.out.println("For loop Example");


        System.out.println("--------------------------------------------------------");
        System.out.println("Looping 5 times. Calculate an number " +
                "and print it after the execution of the loop");

        //loop #1
        int x = 5;
        long f = 1;
        for (int i = 1; i <= x; i++) {
            f = f * i;
        }
        System.out.println("f = " + f);
        //System.out.println("i = " + i);

        //loop #2
        System.out.println("--------------------------------------------------------");
        System.out.println("Multiple commands in the for  statements  ");
        for (int a = 1, b = 100; a < b; a = a + 2, b = b - 4) {
            System.out.println("a = " + a + " and b = " + b);
        }

        //int i=100;
        //loop #3
        System.out.println("--------------------------------------------------------");
        System.out.println(" Print commands in the for  statements  ");
        for (int i = 1; i < 10; i = i + 1, System.out.println("                    Value of a=" + i)) {
            System.out.println("Inside the loop a=" + i);
        }
        //System.out.println("Value of a outside of loop is "+i);
    }
}