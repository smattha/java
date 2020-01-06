package controlStructures;

/**
 * @author Matthaiakis Stergios
 */

import javax.swing.*;

public class TestDo {
    /** Main method */
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------");
        System.out.println("Do");

        int sum = 0;
        int i = 0;

        System.out.println("--------------------------------------------------------");
        System.out.println(" Keep parsing the array of data until the element is 0");

        Integer[] data = {1, 2, 3, 4, 5, 6, 7, 0, 8, 9, 10};

        //
        do {
            sum += data[i];
        } while (data[i++] != 0);

        JOptionPane.showMessageDialog(null, "The sum is " + sum,
                "TestDo", JOptionPane.INFORMATION_MESSAGE);

        return;
    }
}
