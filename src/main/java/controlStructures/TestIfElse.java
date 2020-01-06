package controlStructures;
/**
 * @author Matthaiakis Stergios
 */

import javax.swing.*;

public class TestIfElse {
    /**
     * Main method
     */
    public static void main(String[] args) {
        double annualInterestRate = 0;
        int numOfYears;
        double loanAmount;

        // Prompt the user to enter number of years
        String numOfYearsString = JOptionPane.showInputDialog(null,
                "Enter years :");

        // Convert string into int
        numOfYears = Integer.parseInt(numOfYearsString);

        // Find interest rate based on year
        if (numOfYears < 0) {
            System.out.println("Before Jesus");
        } else if (numOfYears == 0) {
            System.out.println("Jesus is born ");
        } else {
            System.out.println("After Jesus");
        }


        System.exit(0);

    }
}