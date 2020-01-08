package Methods;

/**
 *
 * @author Matthaiakis Stergios
 */
public class TestPassByValue {

  public static void main(String[] args) {
    System.out.println("--------------------------------------------------------");
    System.out.println("Main Method");

    // Declare and initialize variables
    int num1 = 1;
    int num2 = 2;

    System.out.println("Before invoking the swap method, num1 is " +
      num1 + " and num2 is " + num2);

    // Invoke the swap method to attempt to swap two variables
    swap(num1, num2);
    System.out.println("--------------------------------------------------------");
    System.out.println("After  invoking the swap method, num1 is " +
      num1 + " and num2 is " + num2);
  }

  /** A method for swapping two variables */
  static void swap(int n1, int n2) {
    System.out.println("--------------------------------------------------------");
    System.out.println("    Inside the swap method");
    System.out.println("    Before swapping n1 is " + n1
      + " n2 is " + n2);

    // Swapping n1 with n2
    int temp = n1;
    n1 = n2;
    n2 = temp;

    System.out.println("    After  swapping n1 is " + n1
      + " n2 is " + n2);
  }
}
