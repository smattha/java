package datatypes.primitivies;

/**
 * @author MAtthaiakis Stergios
 */
public class FloatDemo {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------");
        System.out.println("Float demo");
        double pi = 3.14159;
        float f = 2.7F;
        System.out.println("pi = " + pi);
        System.out.println("f = " + f);

        int n = 15, d = 4;
        f = n / d;
        System.out.println("15/4 = " + f);

        int radius = 10;
        double area = pi * radius * radius;
        System.out.println("area = " + area);
    }
}
