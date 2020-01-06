package datatypes.objects;

;

/***
 * @author MAtthaiakis Stergios
 */

public class IntegerTestEquality {

    public static void main(String[] args) {

        System.out.println("--------------------------------------------------------");
        System.out.println("Integer wrapper simple test");
        // instantiate Integer objects
        Integer firstInteger = 100;
        Integer secondInteger = new Integer(100);

        // test for equality
        System.out.println(firstInteger.equals(secondInteger));

    }

}