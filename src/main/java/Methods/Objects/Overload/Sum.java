package Methods.Objects.Overload;

/**
 * @author Matthaiakis Stergios
 */

public class Sum {

    // Driver code
    public static void main(String args[]) {
        System.out.println("--------------------------------------------------------");
        System.out.println("Overlad method");
        Sum s = new Sum();
        System.out.println(s.sum(10, 20));
        System.out.println(s.sum(10, 20, 30));
        System.out.println(s.sum(10.5, 20.5));
    }

    // Overloaded sum(). This sum takes two int parameters
    public int sum(int x, int y) {
        System.out.println("--------------------------------------------------------");
        System.out.println("Sum int, int ");
        return (x + y);
    }

    // Overloaded sum(). This sum takes three int parameters
    public int sum(int x, int y, int z) {
        System.out.println("--------------------------------------------------------");
        System.out.println("Sum int int int ");
        return (x + y + z);
    }

    public double sum(double x, double y) {
        System.out.println("--------------------------------------------------------");
        System.out.println("Sum double double");
        return (x + y);
    }
}
