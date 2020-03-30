package ExceptionHandling.CatchDemo2;

/**
 * @author Matthaiakis Stergios
 */
public class CatchDemo2 {
    public static void main(String[] args) {
        System.out.println("Instantiating a MyFileUtilities2 object...");
        MyFileUtilities2 util = new MyFileUtilities2("c:/test12345.txt");

        System.out.println("Invoking readOneByte() method...");
        System.out.println(util.readOneByte());
    }
}
