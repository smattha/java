package advanceTopics;

/**
 * @author MAtthaiakis Stergios
 */
public class CDPlayer extends Electronics {
    private int songNumber;

    {
        //System.out.println("--------------------------------------------------------");
        System.out.println("Inside instance initializer");

    }

    public CDPlayer(int x) {
        super();
        //System.out.println("--------------------------------------------------------");
        System.out.println("Constructing a CDPlayer");
        //System.out.println("--------------------------------------------------------");

        songNumber = x;
    }
}