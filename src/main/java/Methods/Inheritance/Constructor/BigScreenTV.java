/**
 * @author Matthaiakis Stergios
 */


package Methods.Inheritance.Constructor;

/**
 * @author Michail
 */
class BigScreenTV extends Television {
    private String aspectRatio;
    private short size;

    public BigScreenTV() {
        super();
        aspectRatio = "unknown";
        size = 40;
        System.out.println("Inside BigScreenTV()");
    }
}