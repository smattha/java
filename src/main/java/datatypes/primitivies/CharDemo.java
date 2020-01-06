package datatypes.primitivies;

/**
 * @author Matthaiakis Stergios
 */
public class CharDemo {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------");
        System.out.println("Char demo");
        char a = 'A';
        char b = (char) (a + 1);
        System.out.println(a + b);
        System.out.println(a + b + " a + b is " + a + b);

        int x = 75;
        char y = (char) x;

        char half = '\u00AB';
        System.out.println("y is " + y + " and half is " + half);
    }
}