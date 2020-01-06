package controlStructures;

/**
 * @author Matthaiakis Stergios
 */
public class BreakDemo {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------");
        System.out.println("Break Example");
        int k = 1;
        while (k <= 10) {
            System.out.println("Value of k is " + k);
            if (k == 6) {
                System.out.println("k==6 the break command will be executed");
                break;
            }
            k++;
            System.out.println("Current is loop is completed  ");
        }

        System.out.println("The final value of k is " + k);
    }
}

