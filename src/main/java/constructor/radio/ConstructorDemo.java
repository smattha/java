package constructor.radio;

/**
 * @author Matthaiakis Stergios
 */

public class ConstructorDemo {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------");
        System.out.println("Constructor Demo");

        System.out.println("--------------------------------------------------------");
        System.out.println("Instantiating the first Radio");
        Radio x = new Radio();

        System.out.println("--------------------------------------------------------");
        System.out.println("Instantiating the second Radio");
        float station = 100.3F;
        Radio y = new Radio(station);


        System.out.println("\n\n--------------------------------------------------------");
        System.out.println("--------------------Printing results--------------------");
        System.out.println(x.volume + " " + x.tuning + " " + x.band);
        System.out.println(y.volume + " " + y.tuning + " " + y.band);
    }
}
